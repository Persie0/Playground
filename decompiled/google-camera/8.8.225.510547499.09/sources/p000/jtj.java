package p000;

import android.content.IntentFilter;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jtj implements jgc {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f34773a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f34774b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f34775c;

    /* JADX INFO: renamed from: d */
    private final /* synthetic */ int f34776d;

    public /* synthetic */ jtj(jdz jdzVar, jfx jfxVar, joo jooVar, int i, byte[] bArr) {
        this.f34776d = i;
        this.f34774b = jdzVar;
        this.f34773a = jfxVar;
        this.f34775c = jooVar;
    }

    public /* synthetic */ jtj(jqw jqwVar, jfx jfxVar, IntentFilter[] intentFilterArr, int i) {
        this.f34776d = i;
        this.f34773a = jqwVar;
        this.f34774b = jfxVar;
        this.f34775c = intentFilterArr;
    }

    /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.Map] */
    @Override // p000.jgc
    /* JADX INFO: renamed from: a */
    public final void mo13128a(Object obj, Object obj2) {
        switch (this.f34776d) {
            case 0:
                Object obj3 = this.f34773a;
                Object obj4 = this.f34774b;
                Object obj5 = this.f34775c;
                juf jufVar = (juf) obj;
                jtz jtzVar = new jtz((khb) obj2, 0, null, null);
                khb khbVar = jufVar.f34818a;
                jug jugVar = new jug((IntentFilter[]) obj5);
                jugVar.f34826a = (jfx) obj4;
                synchronized (khbVar.f36008a) {
                    if (khbVar.f36008a.get(obj3) != null) {
                        jtzVar.mo12841c(new Status(4001));
                        return;
                    }
                    khbVar.f36008a.put(obj3, jugVar);
                    try {
                        ((jtd) jufVar.m13169u()).m13501e(new jte(khbVar.f36008a, obj3, jtzVar), new jre(jugVar));
                        return;
                    } catch (RemoteException e) {
                        khbVar.f36008a.remove(obj3);
                        throw e;
                    }
                }
            default:
                Object obj6 = this.f34774b;
                Object obj7 = this.f34773a;
                Object obj8 = this.f34775c;
                joo jooVar = new joo((jfx) obj7, 2);
                ((jqp) obj).m13471I((joo) obj8, jooVar, new jqa((jdz) obj6, (khb) obj2, jooVar, null, null, null));
                return;
        }
    }
}
