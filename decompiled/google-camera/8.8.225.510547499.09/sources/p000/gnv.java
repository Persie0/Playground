package p000;

import java.util.function.BiConsumer;
import p021j$.util.function.BiConsumer$CC;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gnv implements BiConsumer {

    /* JADX INFO: renamed from: h */
    private final /* synthetic */ int f25815h;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ gnv f25814g = new gnv(6);

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ gnv f25813f = new gnv(5);

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ gnv f25812e = new gnv(4);

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ gnv f25811d = new gnv(3);

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ gnv f25810c = new gnv(2);

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ gnv f25809b = new gnv(1);

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ gnv f25808a = new gnv(0);

    private /* synthetic */ gnv(int i) {
        this.f25815h = i;
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.f25815h) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
        }
        return BiConsumer$CC.$default$andThen(this, biConsumer);
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        switch (this.f25815h) {
            case 0:
                kpw kpwVar = (kpw) obj2;
                if (kpwVar != null) {
                    kpwVar.close();
                }
                break;
            case 1:
                break;
            case 2:
                kpw kpwVar2 = (kpw) obj2;
                if (kpwVar2 != null) {
                    kpwVar2.close();
                }
                break;
            case 3:
                ((hrv) obj2).mo3448b();
                break;
            case 4:
                ((mwn) obj).m17082g(obj2);
                break;
            case 5:
                ((mxi) obj).mo17072d(obj2);
                break;
            default:
                ((lyz) obj).m16214c((mzj) obj2);
                break;
        }
    }
}
