package p000;

import android.widget.TextView;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ich implements mrf {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f30331a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f30332b;

    public /* synthetic */ ich(int i, int i2) {
        this.f30332b = i2;
        this.f30331a = i;
    }

    @Override // p000.mrf
    public final Object apply(Object obj) {
        switch (this.f30332b) {
            case 0:
                int i = this.f30331a;
                nbh nbhVar = ick.f30339a;
                TextView textView = (TextView) ((Map.Entry) obj).getValue();
                if (textView.getWidth() == 0) {
                    ((nbe) ((nbe) ick.f30339a.m17252c()).mo17276G((char) 4124)).mo17293r("Trying to measure distance to chip %s with zero width i.e. before layout", textView.getText());
                }
                return Integer.valueOf(Math.min(Math.abs(i - textView.getLeft()), Math.abs(i - (textView.getRight() - 1))));
            case 1:
                return Integer.valueOf(((eqz) obj).equals(eqz.LANDSCAPE) ? this.f30331a + 1 : 4);
            default:
                return Integer.valueOf(Math.min(((Long) obj).intValue(), this.f30331a));
        }
    }
}
