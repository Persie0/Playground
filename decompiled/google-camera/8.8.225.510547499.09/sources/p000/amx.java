package p000;

import com.google.android.gms.common.api.Scope;
import java.util.Comparator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class amx implements Comparator {

    /* JADX INFO: renamed from: v */
    private final /* synthetic */ int f758v;

    /* JADX INFO: renamed from: u */
    public static final /* synthetic */ amx f757u = new amx(20);

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ amx f756t = new amx(19);

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ amx f755s = new amx(18);

    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ amx f754r = new amx(17);

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ amx f753q = new amx(16);

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ amx f752p = new amx(15);

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ amx f751o = new amx(14);

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ amx f750n = new amx(13);

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ amx f749m = new amx(12);

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ amx f748l = new amx(11);

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ amx f747k = new amx(10);

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ amx f746j = new amx(9);

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ amx f745i = new amx(8);

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ amx f744h = new amx(7);

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ amx f743g = new amx(6);

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ amx f742f = new amx(5);

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ amx f741e = new amx(4);

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ amx f740d = new amx(3);

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ amx f739c = new amx(2);

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ amx f738b = new amx(1);

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ amx f737a = new amx(0);

    private /* synthetic */ amx(int i) {
        this.f758v = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f758v) {
            case 0:
                int i = ((amy) obj).f760b;
                int i2 = ((amy) obj2).f760b;
                if (i == i2) {
                    return 0;
                }
                return i >= i2 ? 1 : -1;
            case 1:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                int length = bArr.length;
                int length2 = bArr2.length;
                if (length != length2) {
                    return length - length2;
                }
                for (int i3 = 0; i3 < bArr.length; i3++) {
                    byte b = bArr[i3];
                    byte b2 = bArr2[i3];
                    if (b != b2) {
                        return b - b2;
                    }
                }
                return 0;
            case 2:
                gsu gsuVar = (gsu) obj;
                gsu gsuVar2 = (gsu) obj2;
                return (gsuVar2.f26286a.width() * gsuVar2.f26286a.height()) - (gsuVar.f26286a.width() * gsuVar.f26286a.height());
            case 3:
                return ((String) ((dsx) obj).f12521a).compareTo((String) ((dsx) obj2).f12521a);
            case 4:
                return ((String) ((dsx) obj).f12521a).compareTo((String) ((dsx) obj2).f12521a);
            case 5:
                return ((dug) obj).f12589a.f12641b.m6732a() - ((dug) obj2).f12589a.f12641b.m6732a();
            case 6:
                elw elwVar = (elw) obj;
                elw elwVar2 = (elw) obj2;
                int iMo7507p = elwVar.mo7507p();
                int iMo7507p2 = elwVar2.mo7507p();
                if (iMo7507p == 0) {
                    throw null;
                }
                if (iMo7507p == iMo7507p2) {
                    return elwVar.mo7496e().compareTo(elwVar2.mo7496e());
                }
                int iM9540h = gmz.m9540h(elwVar2.mo7507p());
                int iM9540h2 = gmz.m9540h(elwVar.mo7507p());
                if (iM9540h == iM9540h2) {
                    return 0;
                }
                return iM9540h < iM9540h2 ? -1 : 1;
            case 7:
                kfd kfdVarM14358b = ((kiq) obj).m14358b();
                kfdVarM14358b.getClass();
                long j = kfdVarM14358b.f35811b;
                kfd kfdVarM14358b2 = ((kiq) obj2).m14358b();
                kfdVarM14358b2.getClass();
                return (j > kfdVarM14358b2.f35811b ? 1 : (j == kfdVarM14358b2.f35811b ? 0 : -1));
            case 8:
                return (((Long) ((frv) obj).mo8722c().m17180i()).longValue() > ((Long) ((frv) obj2).mo8722c().m17180i()).longValue() ? 1 : (((Long) ((frv) obj).mo8722c().m17180i()).longValue() == ((Long) ((frv) obj2).mo8722c().m17180i()).longValue() ? 0 : -1));
            case 9:
                return Float.compare(((fpx) obj2).mo8669b(), ((fpx) obj).mo8669b());
            case 10:
                return ((Float) obj).compareTo((Float) obj2);
            case 11:
                return Float.compare(((dyu) obj2).f12934b, ((dyu) obj).f12934b);
            case 12:
                return ((ipn) obj).f31753c.compareTo(((ipn) obj2).f31753c);
            case 13:
                return ((Scope) obj).f7600b.compareTo(((Scope) obj2).f7600b);
            case 14:
                int i4 = keo.f35772a;
                return ((ken) obj2).m14047a() - ((ken) obj).m14047a();
            case 15:
                return ((String) obj).compareTo((String) obj2);
            case 16:
                int size = ((kgs) obj).f35958h.f36067c.size();
                int size2 = ((kgs) obj2).f35958h.f36067c.size();
                if (size == size2) {
                    return 0;
                }
                return size >= size2 ? 1 : -1;
            case 17:
                return ((String) obj).compareTo((String) obj2);
            case 18:
                int iIntValue = ((Integer) obj).intValue();
                int iIntValue2 = ((Integer) obj2).intValue();
                if (iIntValue == iIntValue2) {
                    return 0;
                }
                return iIntValue >= iIntValue2 ? 1 : -1;
            case 19:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                if (zBooleanValue == ((Boolean) obj2).booleanValue()) {
                    return 0;
                }
                return !zBooleanValue ? -1 : 1;
            default:
                Object obj3 = ((lhz) obj).f38277a;
                throw null;
        }
    }
}
