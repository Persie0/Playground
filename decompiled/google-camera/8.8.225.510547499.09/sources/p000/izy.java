package p000;

import android.os.Parcel;
import android.os.RemoteException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class izy extends izs {

    /* JADX INFO: renamed from: a */
    public final izx f32742a;

    /* JADX INFO: renamed from: c */
    public jap f32743c;

    /* JADX INFO: renamed from: d */
    private final jai f32744d;

    /* JADX INFO: renamed from: e */
    private final jay f32745e;

    protected izy(izv izvVar) {
        super(izvVar);
        this.f32745e = new jay();
        this.f32742a = new izx(this);
        this.f32744d = new izw(this, izvVar);
    }

    /* JADX INFO: renamed from: C */
    public final void m11954C() {
        this.f32745e.m12811b();
        this.f32744d.m12782d(((Long) jam.f33602x.m11334D()).longValue());
    }

    /* JADX INFO: renamed from: D */
    public final boolean m11955D() {
        izo.m11916a();
        m11946z();
        return this.f32743c != null;
    }

    /* JADX INFO: renamed from: E */
    public final boolean m11956E(jao jaoVar) {
        jib.m13205j(jaoVar);
        izo.m11916a();
        m11946z();
        jap japVar = this.f32743c;
        if (japVar == null) {
            return false;
        }
        String strM12775f = jaoVar.f33614e ? jah.m12775f() : jah.m12777h();
        List listEmptyList = Collections.emptyList();
        try {
            Map map = jaoVar.f33610a;
            long j = jaoVar.f33612c;
            Parcel parcelM3398a = japVar.m3398a();
            parcelM3398a.writeMap(map);
            parcelM3398a.writeLong(j);
            parcelM3398a.writeString(strM12775f);
            parcelM3398a.writeTypedList(listEmptyList);
            japVar.m3400z(1, parcelM3398a);
            m11954C();
            return true;
        } catch (RemoteException e) {
            m11936q("Failed to send hits to AnalyticsService");
            return false;
        }
    }

    @Override // p000.izs
    /* JADX INFO: renamed from: a */
    protected final void mo11918a() {
    }

    /* JADX INFO: renamed from: b */
    public final void m11957b() {
        izo.m11916a();
        m11946z();
        try {
            jir.m13228a().m13231b(m11924d(), this.f32742a);
        } catch (IllegalArgumentException e) {
        } catch (IllegalStateException e2) {
        }
        if (this.f32743c != null) {
            this.f32743c = null;
            m11958c();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m11958c() {
        izq izqVarM11926f = m11926f();
        izqVarM11926f.m11946z();
        izo.m11916a();
        jaf jafVar = izqVarM11926f.f32722a;
        izo.m11916a();
        jafVar.m11946z();
        jafVar.m11936q("Service disconnected");
    }
}
