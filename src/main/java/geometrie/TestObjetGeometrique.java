package geometrie;

public class TestObjetGeometrique {
    public static void main(String[] args) {
        ObjetGeometrique[] objetGeometriques = new ObjetGeometrique[2];
        objetGeometriques[0] = new Cercle(5.0);
        objetGeometriques[1] = new Rectangle(3.0, 5.0);

        for(ObjetGeometrique obj : objetGeometriques) {
            System.out.println(obj.perimetre() + obj.surface());
        }
    }
}
