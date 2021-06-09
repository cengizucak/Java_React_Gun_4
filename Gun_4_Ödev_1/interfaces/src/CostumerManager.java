public class CostumerManager {

   private ICostomerDal   costomerDal;

    public CostumerManager(ICostomerDal costomerDal) {
        this.costomerDal = costomerDal;
    }

    public void add(){  //iskodlari yazilir buraya

        costomerDal.add();


    }
}
