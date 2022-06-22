import java.util.ArrayList;
import java.util.List;

public class PythagoreanTriplet {

    private List<PythagoreanTriplet> list;
    private int a;
    private int b;
    private int c;

    public PythagoreanTriplet(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private PythagoreanTriplet()
    {

    }

    public static PythagoreanTriplet makeTripletsList()
    {
        PythagoreanTriplet Runner =new PythagoreanTriplet();
        Runner.list=new ArrayList<PythagoreanTriplet>();
        return Runner;
    }

    public PythagoreanTriplet withFactorsLessThanOrEqualTo(int factorLimit)
    {
        for(int i=1;i<=factorLimit;i++)
        {
            for(int j=i+1;j<=factorLimit;j++)
            {
                double sqrSum= Math.pow(i,2)+Math.pow(j,2);
                int sqrtSum = (int)Math.sqrt(sqrSum);
                if(Math.pow(sqrtSum,2)==sqrSum && sqrtSum<=factorLimit)
                {
                    this.list.add(new PythagoreanTriplet(i,j,sqrtSum));
                }
            }
        }
        return this;
    }

    public  PythagoreanTriplet thatSumTo(int sumRequired)
    {
        int iterator=0;
        while(iterator<this.list.size())
        {
            PythagoreanTriplet triplet= this.list.get(iterator);
            if(triplet.a+triplet.b+triplet.c!=sumRequired)
            {
                this.list.remove(iterator);
            }
            else {
                iterator++;
            }

        }
        return this;
    }

    public List<PythagoreanTriplet> build()
    {
        return this.list;
    }



    @Override
    public boolean equals(Object obj) {
        PythagoreanTriplet pt = (PythagoreanTriplet) obj;
        return (pt.a==this.a&&pt.b==this.b&&pt.c==this.c);
    }

    @Override
    public String toString() {
        return "[a : "+this.a+" b : "+this.b+" c : "+this.c+"]";
    }
}
