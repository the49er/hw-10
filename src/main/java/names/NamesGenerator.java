package names;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class NamesGenerator {

        public Collection<Name> generator(int quantity) {
                Random random = new Random();

                List<String> names = List.of("Ivan", "Peter", "Vlad", "Egor", "Vladimir", "Sergey", "John", "Bill", "Joseph", "Oleg", "Andrew", "Alex", "Vasiliy");
                Collection<Name> namesList = new ArrayList<>();
                int count = 1;

                for (int i = 0; i < quantity; i++) {
                        String name = names.get(random.nextInt(names.size()));
                        namesList.add(new Name(count, name));
                        count++;
                }
        return namesList;
        }

        public class Name {
                private int position;
                private String name;

                public Name(int position, String name) {
                        this.position = position;
                        this.name = name;
                }

                public int getPosition() {
                        return position;
                }

                public String getName() {
                        return name;
                }
        }
}
