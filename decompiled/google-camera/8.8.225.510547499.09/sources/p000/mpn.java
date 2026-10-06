package p000;

import java.util.function.Consumer;
import p021j$.util.function.Consumer$CC;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class mpn implements Consumer {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ mpn f41260a = new mpn(1);

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f41261b;

    public /* synthetic */ mpn(int i) {
        this.f41261b = i;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f41261b) {
            case 0:
                break;
            case 1:
                ((inr) obj).mo10342b();
                break;
            default:
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f41261b) {
            case 0:
                break;
            case 1:
                break;
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
