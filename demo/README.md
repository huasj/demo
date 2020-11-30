# 流操作
list.stream().collect(Collectors.collectingAndThen(Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(User::getCode))), ArrayList::new));
list.stream().collect(Collectors.collectingAndThen(Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(p -> p.getCode() + ";" + p.getAddress()))), ArrayList::new));
list.stream().collect(Collectors.toMap(p -> p.getOrgId(), p -> p.getOrgId()));
list.stream().map(User::getCode).collect(Collectors.toList());
list.stream().sorted(Comparator.comparing(User::getCode).thenComparing(User::getAddress)).collect(Collectors.toList());
list.stream().collect(Collectors.groupingBy(User::getCode, Collectors.groupingBy(User::getAddress, LinkedHashMap::new, Collectors.toList())));
list.stream().filter(item -> !list.stream().map(User::getCode).collect(Collectors.toList()).contains(item.getAddress())).collect(Collectors.toList());

# 代码行数查询
git log --format='%aN' | sort -u | while read name; do echo -en "$name\t";  git log --since==2020-05-25 --until=2020-06-25  --author="$name" --pretty=tformat: --numstat | awk '{ add += $1; subs += $2; loc += $1 - $2 }
END { printf "added lines: %s, removed lines: %s, total lines: %s\n", add, subs, loc }' -; done


 Student student1 = new Student();
        student1.setId("1");
        student1.setName("name1");
        student1.setAge(20);
        Student student2 = new Student();
        Optional.ofNullable(student1).orElse(createStudent());
        Optional.ofNullable(student1).orElseGet(() -> createStudent());
        String email = Optional.ofNullable(student1)
                .map(s -> s.getName()).orElse("name");
        System.out.println();


var wait = function () {
    var dtd = $.Deferred();
    var task = function () {
        alert("执行完毕");
        dtd.resolve();
    }
    setTimeout(task, 3000);
    return dtd.promise();
}
$.when(wait()).done(function () {
    alert("执行完啦");
}).fail(function () {
    alert("执行失败");
})
var wait = function (dfd) {
    var task = function () {
        alert('completed!!');
        dfd.resolve();
    }
    setTimeout(task, 5000);
}
$.Deferred(wait).done(function () {
    alert('done')
});