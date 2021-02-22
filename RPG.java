public class RPG {
    public static int myhp;
    public static int dkhp;
    public static String question;
    public static void main(final String[] args){
    //処理開始前の時刻
    long start_point = System.currentTimeMillis();
    //計測したい処理
    System.out.println("ようこそ！勇者様！RPGの世界へ！");
    System.out.println("あなたの名前を教えていただきますか？");
    final java.util.Scanner s = new java.util.Scanner(System.in);
    final String yourname = s.next(); /* 自分の名前を入力 */
    System.out.println("" + yourname + "さんですね。");
    System.out.println("" + yourname + "さん、どうか、魔王に侵略されたこの世界を救っていただけませんか？");
    question();
    System.out.println("では魔王城まで転送いたします、、、");
    System.out.println("突然、目の前に魔王が現れた！!！");
    final status f = new status();/*statusクラスの実行*/
    if(f.statuss()==0){
        long end_over = System.currentTimeMillis();
        long time1 = end_over - start_point;
        System.out.println("処理に要した時間=" + time1);
        System.exit(1);
    }
    final status2 g = new status2();/*statusクラスの実行*/
    if(g.statuss2()==0){
        long end_over1 = System.currentTimeMillis();
        long time2 = end_over1 - start_point;
        System.out.println("処理に要した時間=" + time2);
        System.exit(1);
    }
    System.out.println("お疲れ様でした！\n" + yourname + "さん。");
    System.out.println("" + yourname + "さんまたいつか力を貸してくださいね！");
    //処理終了時の時刻
    long end_point = System.currentTimeMillis();
    //処理終了時の時刻-処理開始前の時刻
    long time = end_point - start_point;
    //結果を出力
    System.out.println("処理開始前の時刻=" + start_point);
    System.out.println("処理終了時の時刻=" + end_point);
    System.out.println("処理に要した時間=" + time);
}
    static void question(){
    System.out.println("コマンドを選択してください。(数字を入力してください。）");
    System.out.println("1はい　2いいえ");
    final java.util.Scanner s = new java.util.Scanner(System.in);
    final int command = s.nextInt();/*コマンド入力*/
    if(command==1){
        System.out.println("おお、勇者様、誠にありがとうございます。どうかご無事で、、");
    }
    else if(command==2){
        System.out.println("そこをどうかお願いします！！");
        question();
    }
    else {
        System.out.println("正しいコマンドを入力してください。（半角になってますか？）");
    }
}
}
class status{
    public int myhp = 120;/*自分の体力*/
    int myat = 10;/*自分の攻撃力*/
    int dkhp = 100;/*魔王の体力*/
    int dkat = 10;/*魔王の攻撃力*/
    int dkat2 = 5;/*自分が防御した時の魔王の攻撃力*/
    // long end_over;
    long time1;
    int statuss(){
        while (myhp > 0 && dkhp > 0) {
            System.out.println("HP=" + myhp + " MP=0");
            System.out.println("コマンドを選択してください。(数字を入力してください。）");
            System.out.println("1攻撃 2防御 3薬草の使用 4逃げる ");
            final java.util.Scanner s = new java.util.Scanner(System.in);
            final int command = s.nextInt();/*コマンド入力*/
            if (command == 1) {
                    myhp = myhp - dkat;
                    dkhp = dkhp - myat;
                    System.out.println("あなたは"+ myat +"ダメージ与えた。");
                    System.out.println("あなたは"+ dkat +"ダメージ受けた。");
                }
                else if(command==2){
                    myhp = myhp - dkat +5;
                    System.out.println("魔王の攻撃を防御した。");
                    System.out.println("あなたは"+ dkat2 +"ダメージ受けた。");
                }
                else if(command==3){
                    myhp = myhp + 30;
                    myhp = myhp -dkat;
                    System.out.println("あなたは薬草でmyhpが30回復した。");
                    System.out.println("あなたは"+ dkat +"ダメージ受けた。");
                }
                else if(command==4){
                    System.out.println("魔王から逃げ出した。");
                    System.out.println("ゲームオーバー、、、");
                    break;
                }
                else {
                    System.out.println("正しいコマンドを入力してください。（半角になってますか？）");
                }
            }
            if(dkhp <= 0){
                System.out.println("魔王の様子が、、、");
                System.out.println("魔王が地面に倒れた、、");
                System.out.println("魔王を討伐した！！");
                return 1;
            }
        if (myhp <= 0){
            System.out.println("HPが0になってしまった、、\nゲームオーバー");
            return 0;
        }
        return 0;
    }
}


class status2{
    public int myhp = 120;/*自分の体力*/
    int myat = 10;/*自分の攻撃力*/
    int dkhp = 150;/*魔王の体力*/
    int dkat = 20;/*魔王の攻撃力*/
    int dkat2 = 15;/*自分が防御した時の魔王の攻撃力*/
    long end_over1;
    long time2;
    int statuss2() {
        System.out.println("魔王が真の姿を現した。\n真魔王が現れた！");
        while (myhp > 0 && dkhp > 0) {
            System.out.println("HP=" + myhp + " MP=0");
            System.out.println("コマンドを選択してください。(数字を入力してください。）");
            System.out.println("1攻撃 2防御 3薬草の使用 4逃げる ");
            final java.util.Scanner s = new java.util.Scanner(System.in);
            final int command = s.nextInt();/*コマンド入力*/
            if (command == 1) {
                    myhp = myhp - dkat;
                    dkhp = dkhp - myat;
                    System.out.println("あなたは"+ myat +"ダメージ与えた。");
                    System.out.println("あなたは"+ dkat +"ダメージ受けた。");
                }
                else if(command==2){
                    myhp = myhp - dkat +5;
                    System.out.println("あなたは"+ dkat2 +"ダメージ受けた。");
                }
                else if(command==3){
                    myhp = myhp + 30;
                    myhp = myhp -dkat;
                    System.out.println("あなたは30ダメージ回復した。");
                    System.out.println("あなたは"+ dkat +"ダメージ受けた。");
                }  
                else if(command==4){
                    System.out.println("ゲームオーバー");
                    break;
                }
                else {
                    System.out.println("正しいコマンドを入力してください。（半角になってますか？）");
                }
            }
            if(dkhp <= 0){
                System.out.println("真魔王の様子が、、、");
                System.out.println("真魔王は地面に崩れ落ちた。");
                System.out.println("真魔王を倒した！");
                return 1;
            }
        if (myhp <= 0){
            System.out.println("HPが0になった。\nゲームオーバー");
            end_over1 = System.currentTimeMillis();
            return 0;
        }
    return 0;
    }
}
    
        