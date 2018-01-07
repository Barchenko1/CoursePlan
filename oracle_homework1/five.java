package homework1;

public class five {
    public static void main(String[] args) {
        int a=1;
        int b=2;
        int c=3;
        int max=0;
        int mid=0;
        if (a>b) {if (a>c){max=a;
        }}
        if (b>a) {if (b>c){max=b;
        }}
        if (c>a) {if (c>b){max=c;
        }}

        if (a>b) {if (a<c){mid=a;
        }}
        if (b>a) {if (b<c){mid=b;
        }}
        if (c>a) {if (c<b){mid=c;
        }}

        if (a<b) {if (a>c){mid=a;
        }}
        if (b<a) {if (b>c){mid=b;
        }}
        if (c<a) {if (c>b){mid=c;
        }}
        int sum=max+mid;
        System.out.println(max);
        System.out.println(mid);
        System.out.println(sum);
    }
}
