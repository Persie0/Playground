package p000;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jin implements jgc {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f34131a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f34132b;

    public /* synthetic */ jin(String str, int i) {
        this.f34132b = i;
        this.f34131a = str;
    }

    public /* synthetic */ jin(jch jchVar, int i) {
        this.f34132b = i;
        this.f34131a = jchVar;
    }

    public /* synthetic */ jin(jdz jdzVar, int i) {
        this.f34132b = i;
        this.f34131a = jdzVar;
    }

    public /* synthetic */ jin(jih jihVar, int i) {
        this.f34132b = i;
        this.f34131a = jihVar;
    }

    public /* synthetic */ jin(jqw jqwVar, int i) {
        this.f34132b = i;
        this.f34131a = jqwVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.Object, java.util.Map] */
    @Override // p000.jgc
    /* JADX INFO: renamed from: a */
    public final void mo13128a(Object obj, Object obj2) {
        switch (this.f34132b) {
            case 0:
                ?? r0 = this.f34131a;
                jim jimVar = (jim) ((jiq) obj).m13169u();
                Parcel parcelM3398a = jimVar.m3398a();
                cbs.m3404c(parcelM3398a, r0);
                jimVar.m3397A(1, parcelM3398a);
                ((khb) obj2).m14243i(null);
                return;
            case 1:
                ?? r1 = this.f34131a;
                jci jciVar = new jci((khb) obj2, null, null);
                jco jcoVar = (jco) ((jcm) obj).m13169u();
                Parcel parcelM3398a2 = jcoVar.m3398a();
                cbs.m3405d(parcelM3398a2, jciVar);
                cbs.m3404c(parcelM3398a2, r1);
                jcoVar.m3397A(8, parcelM3398a2);
                return;
            case 2:
                Object obj3 = this.f34131a;
                ((jop) ((joq) obj).m13169u()).m13412e(new joo((khb) obj2, 0, null, null), (String) obj3);
                return;
            case 3:
                jdz jdzVar = (jdz) this.f34131a;
                ((jqp) obj).m13471I(((jqe) jdzVar.f33822e).f34588a, null, new jqb(jdzVar, (khb) obj2, null, null));
                return;
            default:
                Object obj4 = this.f34131a;
                juf jufVar = (juf) obj;
                jtz jtzVar = new jtz((khb) obj2, 1, null, null);
                khb khbVar = jufVar.f34818a;
                synchronized (khbVar.f36008a) {
                    jug jugVar = (jug) khbVar.f36008a.remove(obj4);
                    if (jugVar == null) {
                        jtzVar.mo12841c(new Status(4002));
                        return;
                    }
                    jugVar.m13504m();
                    jtd jtdVar = (jtd) jufVar.m13169u();
                    jtf jtfVar = new jtf(khbVar.f36008a, obj4, jtzVar);
                    jts jtsVar = new jts(jugVar);
                    Parcel parcelM3398a3 = jtdVar.m3398a();
                    cbs.m3405d(parcelM3398a3, jtfVar);
                    cbs.m3404c(parcelM3398a3, jtsVar);
                    jtdVar.m3400z(17, parcelM3398a3);
                    return;
                }
        }
    }
}
