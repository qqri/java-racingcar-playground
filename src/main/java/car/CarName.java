package car;

public class CarName {
    String name;

    public CarName(String name) {
        check(name);
        this.name = name;
    }

    private void check(String name) {
        if(name.length() > 5) throw new IllegalStateException("자동차의 이름은 5자리를 넘을 수 없습니다!");
    }

}
