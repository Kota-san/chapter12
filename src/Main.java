//TIP コードを<b>実行</b>するには、<shortcut actionId="Run"/> を押すか
// ガターの <icon src="AllIcons.Actions.Execute"/> アイコンをクリックします。
public class Main {
    public static void main(String[] args) {
        Character[] party = new Character[3];
        party[0] = new Hero();
        party[1] = new Wizard();
        party[2] = new Thief();

        for (Character member : party) {
            member.hp += 50; // 全員のHPを回復
        }
    }
}