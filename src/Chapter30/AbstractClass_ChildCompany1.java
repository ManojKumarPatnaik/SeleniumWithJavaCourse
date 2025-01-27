package Chapter30;

/**
 * Podpinam się do Parent Class za pomocą keyworda 'extends'
 */
public class AbstractClass_ChildCompany1  extends AbstractClass_ParentAircraftRules{

    public static void main(String[] args) {

        AbstractClass_ChildCompany1 childCompany1 = new AbstractClass_ChildCompany1();
        /**
         * Utworzyłem obiekt klasy 'AbstractClass_ChildCompany1', która dziedziczy metody z 'AbstractClass_ParentAircraftRules'
         */
        childCompany1.engine();
        childCompany1.safety();
        childCompany1.color();

        /**
         * Nie mogę utworzyć obiektu klasy 'AbstractClass_ParentAircraftRules'. Abstract class cannot be instantiate
         */
        //AbstractClass_ParentAircraftRules parentAircraftRules = new AbstractClass_ParentAircraftRules();
    }

    /**
     * W momencie kiedy jestem podpięty pod jakąś Abstract Parent Class, muszę w tym momencie zaimplementować wszystkie jej abstract methods,
     * dodać im body
     */

    @Override
    public void color() {
        System.out.println("Follow color rules specific for Company1");
    }
}
