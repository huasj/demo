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