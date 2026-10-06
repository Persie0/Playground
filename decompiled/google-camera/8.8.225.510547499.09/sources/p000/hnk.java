package p000;

import android.content.ContentProviderOperation;
import android.hardware.camera2.params.OutputConfiguration;
import android.location.Location;
import android.media.MediaCodec;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hnk implements mrf {

    /* JADX INFO: renamed from: u */
    private final /* synthetic */ int f28508u;

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ hnk f28507t = new hnk(20);

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ hnk f28506s = new hnk(19);

    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ hnk f28505r = new hnk(18);

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ hnk f28504q = new hnk(17);

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ hnk f28503p = new hnk(16);

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ hnk f28502o = new hnk(15);

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ hnk f28501n = new hnk(14);

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ hnk f28500m = new hnk(13);

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ hnk f28499l = new hnk(12);

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ hnk f28498k = new hnk(11);

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ hnk f28497j = new hnk(9);

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ hnk f28496i = new hnk(8);

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ hnk f28495h = new hnk(7);

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ hnk f28494g = new hnk(6);

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ hnk f28493f = new hnk(5);

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ hnk f28492e = new hnk(4);

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ hnk f28491d = new hnk(3);

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ hnk f28490c = new hnk(2);

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ hnk f28489b = new hnk(1);

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ hnk f28488a = new hnk(0);

    public /* synthetic */ hnk(int i) {
        this.f28508u = i;
    }

    @Override // p000.mrf
    public final Object apply(Object obj) {
        boolean z = false;
        switch (this.f28508u) {
            case 0:
                List list = (List) obj;
                hnp hnpVar = (hnp) list.get(0);
                hno hnoVar = (hno) list.get(1);
                if (hnpVar.equals(hnp.ON)) {
                    z = true;
                } else if (hnpVar.equals(hnp.AUTO) && hnoVar.equals(hno.ACTIVE)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 1:
                List list2 = (List) obj;
                hnp hnpVar2 = (hnp) list2.get(0);
                hno hnoVar2 = (hno) list2.get(1);
                if (hnpVar2.equals(hnp.ON) || (hnpVar2.equals(hnp.AUTO) && hnoVar2.equals(hno.ACTIVE))) {
                    z = true;
                } else if (hnpVar2.equals(hnp.OFF) && hnoVar2.equals(hno.TRANSITION_TO_ACTIVE)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 2:
                return ((ipq) obj).mo11593a();
            case 3:
                ((nbe) ((nbe) ((nbe) hth.f29500a.m17252c()).mo17283h((Throwable) obj)).mo17276G(3948)).mo17290o("Failed to update indicator bitmap cache");
                return true;
            case 4:
                return ((ibz) obj).f30280a;
            case 5:
                return Integer.valueOf(((ibz) obj).f30281b);
            case 6:
                return ((pbp) obj).mo17758H();
            case 7:
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    if (!((Boolean) it.next()).booleanValue()) {
                        return false;
                    }
                }
                return true;
            case 8:
                Iterator it2 = ((List) obj).iterator();
                while (it2.hasNext()) {
                    if (((Boolean) it2.next()).booleanValue()) {
                        return true;
                    }
                }
                return false;
            case 9:
                List<Comparable> list3 = (List) obj;
                Comparable comparable = (Comparable) list3.get(0);
                for (Comparable comparable2 : list3) {
                    if (comparable.compareTo(comparable2) > 0) {
                        comparable = comparable2;
                    }
                }
                return comparable;
            case 10:
                return kle.m14476f((knw) obj, null, true);
            case 11:
                kpr kprVar = (kpr) obj;
                kprVar.getClass();
                return (OutputConfiguration) kprVar.mo7254j().f36008a;
            case 12:
                ContentProviderOperation contentProviderOperation = (ContentProviderOperation) obj;
                String authority = contentProviderOperation.getUri().getAuthority();
                contentProviderOperation.getUri();
                authority.getClass();
                return authority;
            case 13:
                return ((MediaCodec) obj).createInputSurface();
            case 14:
                Location location = (Location) obj;
                if (location == null) {
                    return null;
                }
                return Float.valueOf((float) location.getLatitude());
            case 15:
                Location location2 = (Location) obj;
                if (location2 == null) {
                    return null;
                }
                return Float.valueOf((float) location2.getLongitude());
            case 16:
                return new lpe((FileDescriptor) obj);
            case 17:
                return nwr.m17801w((String) obj);
            case 18:
                Log.e("CheckboxChecker", "fetching usage reporting opt-in failed", (Throwable) obj);
                return true;
            case 19:
                return nqp.m17625a((String) obj);
            default:
                return Integer.valueOf(Log.w("AccountRemovedRecv", "Failed to remove account snapshot: ", (IOException) obj));
        }
    }
}
