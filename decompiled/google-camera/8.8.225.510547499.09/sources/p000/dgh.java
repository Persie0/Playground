package p000;

import android.graphics.Rect;
import java.util.function.IntFunction;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class dgh implements IntFunction {

    /* JADX INFO: renamed from: d */
    private final /* synthetic */ int f10887d;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ dgh f10886c = new dgh(2);

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ dgh f10885b = new dgh(1);

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ dgh f10884a = new dgh(0);

    private /* synthetic */ dgh(int i) {
        this.f10887d = i;
    }

    @Override // java.util.function.IntFunction
    public final Object apply(int i) {
        switch (this.f10887d) {
            case 0:
                return new Rect[i];
            case 1:
                return new ddp[i];
            default:
                return new kpe[i];
        }
    }
}
