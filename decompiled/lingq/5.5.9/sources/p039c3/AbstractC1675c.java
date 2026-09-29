package p039c3;

import android.content.Context;
import android.view.LayoutInflater;

/* JADX INFO: renamed from: c3.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1675c extends AbstractC1673a {

    /* JADX INFO: renamed from: h */
    public final int f9390h;

    /* JADX INFO: renamed from: i */
    public final int f9391i;

    /* JADX INFO: renamed from: j */
    public final LayoutInflater f9392j;

    @Deprecated
    public AbstractC1675c(Context context, int i10) {
        super(context);
        this.f9391i = i10;
        this.f9390h = i10;
        this.f9392j = (LayoutInflater) context.getSystemService("layout_inflater");
    }
}
