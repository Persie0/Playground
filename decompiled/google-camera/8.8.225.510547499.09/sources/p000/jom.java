package p000;

import android.os.Parcel;
import com.google.android.gms.location.LocationRequest;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jom implements jgc {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f34486a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f34487b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ int f34488c;

    public /* synthetic */ jom(String str, int i) {
        this.f34488c = i;
        this.f34486a = str;
        this.f34487b = "";
    }

    public /* synthetic */ jom(String str, String str2, int i) {
        this.f34488c = i;
        this.f34486a = str;
        this.f34487b = str2;
    }

    public /* synthetic */ jom(jno jnoVar, LocationRequest locationRequest, int i) {
        this.f34488c = i;
        this.f34487b = jnoVar;
        this.f34486a = locationRequest;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [android.os.Parcelable, java.lang.Object] */
    @Override // p000.jgc
    /* JADX INFO: renamed from: a */
    public final void mo13128a(Object obj, Object obj2) {
        jnb jnbVar;
        switch (this.f34488c) {
            case 0:
                Object obj3 = this.f34486a;
                Object obj4 = this.f34487b;
                joo jooVar = new joo((khb) obj2, 0, null, null);
                jop jopVar = (jop) ((joq) obj).m13169u();
                Parcel parcelM3398a = jopVar.m3398a();
                cbs.m3405d(parcelM3398a, jooVar);
                parcelM3398a.writeString((String) obj3);
                parcelM3398a.writeString((String) obj4);
                parcelM3398a.writeString(null);
                jopVar.m3400z(11, parcelM3398a);
                return;
            case 1:
                Object obj5 = this.f34487b;
                ?? r2 = this.f34486a;
                jnu jnuVar = (jnu) obj;
                jfx jfxVarM13390b = ((jno) obj5).m13390b();
                jfv jfvVar = jfxVarM13390b.f33922b;
                jfvVar.getClass();
                boolean zM13394I = jnuVar.m13394I(jmy.f34390j);
                synchronized (jnuVar.f34419a) {
                    jnb jnbVar2 = (jnb) jnuVar.f34419a.get(jfvVar);
                    if (jnbVar2 == null || zM13394I) {
                        jnb jnbVar3 = new jnb((jno) obj5);
                        jnuVar.f34419a.put(jfvVar, jnbVar3);
                        jnbVar = jnbVar3;
                    } else {
                        jnbVar2.f34393a.m13391c(jfxVarM13390b);
                        jnbVar = jnbVar2;
                        jnbVar2 = null;
                    }
                    String str = jfvVar.f33920b + "@" + System.identityHashCode(jfvVar.f33919a);
                    if (zM13394I) {
                        jnk jnkVar = (jnk) jnuVar.m13169u();
                        jnv jnvVarM13395a = jnv.m13395a(jnbVar2, jnbVar, str);
                        jfr jfrVarM13393J = jnu.m13393J((khb) obj2, null);
                        Parcel parcelM3398a2 = jnkVar.m3398a();
                        cbs.m3404c(parcelM3398a2, jnvVarM13395a);
                        cbs.m3404c(parcelM3398a2, r2);
                        cbs.m3405d(parcelM3398a2, jfrVarM13393J);
                        jnkVar.m3400z(88, parcelM3398a2);
                    } else {
                        ((jnk) jnuVar.m13169u()).m13388e(new jnx(1, new jnw(jpd.m13424e(((LocationRequest) r2).f7753a, ((LocationRequest) r2).f7754b, ((LocationRequest) r2).f7755c, ((LocationRequest) r2).f7756d, ((LocationRequest) r2).f7757e, ((LocationRequest) r2).f7758f, ((LocationRequest) r2).f7759g, ((LocationRequest) r2).f7760h, ((LocationRequest) r2).f7761i, ((LocationRequest) r2).f7762j, ((LocationRequest) r2).f7763k, ((LocationRequest) r2).f7764l, ((LocationRequest) r2).f7765m, ((LocationRequest) r2).f7766n, ((LocationRequest) r2).f7767o), null, false, false, false, false, Long.MAX_VALUE), jnbVar, null, null, new jns((khb) obj2, jnbVar, null, null), str));
                    }
                    break;
                }
                return;
            default:
                Object obj6 = this.f34486a;
                Object obj7 = this.f34487b;
                joo jooVar2 = new joo((khb) obj2, 0, null, null);
                ((jop) ((joq) obj).m13169u()).m13412e(jooVar2, "CURRENT:" + ((String) obj7) + ":" + ((String) obj6));
                return;
        }
    }
}
