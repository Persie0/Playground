package p000;

import androidx.window.sidecar.SidecarDisplayFeature;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class axf extends ood implements oni {

    /* JADX INFO: renamed from: k */
    private final /* synthetic */ int f2647k;

    /* JADX INFO: renamed from: j */
    public static final axf f2646j = new axf(9);

    /* JADX INFO: renamed from: i */
    public static final axf f2645i = new axf(8);

    /* JADX INFO: renamed from: h */
    public static final axf f2644h = new axf(7);

    /* JADX INFO: renamed from: g */
    public static final axf f2643g = new axf(6);

    /* JADX INFO: renamed from: f */
    public static final axf f2642f = new axf(5);

    /* JADX INFO: renamed from: e */
    public static final axf f2641e = new axf(4);

    /* JADX INFO: renamed from: d */
    public static final axf f2640d = new axf(3);

    /* JADX INFO: renamed from: c */
    public static final axf f2639c = new axf(2);

    /* JADX INFO: renamed from: b */
    public static final axf f2638b = new axf(1);

    /* JADX INFO: renamed from: a */
    public static final axf f2637a = new axf(0);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axf(int i) {
        super(1);
        this.f2647k = i;
    }

    @Override // p000.oni
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object mo1803a(Object obj) {
        boolean z = false;
        switch (this.f2647k) {
            case 0:
                SidecarDisplayFeature sidecarDisplayFeature = (SidecarDisplayFeature) obj;
                sidecarDisplayFeature.getClass();
                return Boolean.valueOf(sidecarDisplayFeature.getType() == 1 || sidecarDisplayFeature.getType() == 2);
            case 1:
                ((alz) obj).getClass();
                return new aln();
            case 2:
                SidecarDisplayFeature sidecarDisplayFeature2 = (SidecarDisplayFeature) obj;
                sidecarDisplayFeature2.getClass();
                return Boolean.valueOf((sidecarDisplayFeature2.getRect().width() == 0 && sidecarDisplayFeature2.getRect().height() == 0) ? false : true);
            case 3:
                SidecarDisplayFeature sidecarDisplayFeature3 = (SidecarDisplayFeature) obj;
                sidecarDisplayFeature3.getClass();
                if (sidecarDisplayFeature3.getType() != 1 || sidecarDisplayFeature3.getRect().width() == 0 || sidecarDisplayFeature3.getRect().height() == 0) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 4:
                SidecarDisplayFeature sidecarDisplayFeature4 = (SidecarDisplayFeature) obj;
                sidecarDisplayFeature4.getClass();
                return Boolean.valueOf(sidecarDisplayFeature4.getRect().left == 0 || sidecarDisplayFeature4.getRect().top == 0);
            case 5:
                lvi lviVar = (lvi) obj;
                lviVar.getClass();
                return String.valueOf(lviVar.ordinal());
            case 6:
                String str = (String) obj;
                str.getClass();
                return str;
            case 7:
                olv olvVar = (olv) obj;
                olvVar.getClass();
                if (olvVar instanceof oqo) {
                    return (oqo) olvVar;
                }
                return null;
            case 8:
                olv olvVar2 = (olv) obj;
                olvVar2.getClass();
                if (olvVar2 instanceof orq) {
                    return (orq) olvVar2;
                }
                return null;
            default:
                ((Throwable) obj).getClass();
                return null;
        }
    }
}
