package p000;

import android.location.Location;
import com.google.android.apps.camera.stats.timing.OneCameraTiming;
import com.google.android.libraries.camera.exif.ExifInterface;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fye implements mrf {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f23878a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f23879b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f23880c;

    /* JADX INFO: renamed from: d */
    private final /* synthetic */ int f23881d;

    public /* synthetic */ fye(fyf fyfVar, List list, gzl gzlVar, int i) {
        this.f23881d = i;
        this.f23878a = fyfVar;
        this.f23879b = list;
        this.f23880c = gzlVar;
    }

    public /* synthetic */ fye(gwy gwyVar, hln hlnVar, guk gukVar, int i) {
        this.f23881d = i;
        this.f23880c = gwyVar;
        this.f23879b = hlnVar;
        this.f23878a = gukVar;
    }

    public /* synthetic */ fye(gye gyeVar, gyu gyuVar, gyx gyxVar, int i) {
        this.f23881d = i;
        this.f23878a = gyeVar;
        this.f23880c = gyuVar;
        this.f23879b = gyxVar;
    }

    public /* synthetic */ fye(kba kbaVar, OneCameraTiming oneCameraTiming, fuc fucVar, int i) {
        this.f23881d = i;
        this.f23879b = kbaVar;
        this.f23880c = oneCameraTiming;
        this.f23878a = fucVar;
    }

    /* JADX WARN: Type inference failed for: r14v7, types: [java.lang.Object, kba] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    @Override // p000.mrf
    public final Object apply(Object obj) {
        ken kenVarM4686k;
        int i = 0;
        switch (this.f23881d) {
            case 0:
                Object obj2 = this.f23878a;
                ?? r2 = this.f23879b;
                Object obj3 = this.f23880c;
                Integer num = (Integer) obj;
                while (i < r2.size()) {
                    if (i != num.intValue()) {
                        ((fxn) r2.get(i)).close();
                    }
                    i++;
                }
                grl grlVarM9672b = grm.m9672b((fxn) r2.get(num.intValue()));
                fyf fyfVar = (fyf) obj2;
                kay kayVar = fyfVar.f23885d;
                kayVar.getClass();
                grlVarM9672b.f26145c = kayVar;
                grlVarM9672b.f26149g = (gzl) obj3;
                grlVarM9672b.f26143a = fyfVar.f23883b.f23576d;
                return grlVarM9672b.m9669a();
            case 1:
                ?? r14 = this.f23879b;
                Object obj4 = this.f23880c;
                Object obj5 = this.f23878a;
                r14.close();
                hlc hlcVar = (hlc) obj4;
                hlcVar.m10437h(hkv.ONECAMERA_STARTED);
                OneCameraTiming oneCameraTiming = (OneCameraTiming) obj4;
                oneCameraTiming.f6971b.mo13952a();
                oneCameraTiming.f6971b = kcc.f35555b;
                hlcVar.close();
                return obj5;
            case 2:
                Object obj6 = this.f23880c;
                Object obj7 = this.f23879b;
                Object obj8 = this.f23878a;
                ExifInterface exifInterface = (ExifInterface) obj;
                hln hlnVar = (hln) obj7;
                if (hlnVar.f28266a.equals(krd.JPEG)) {
                    kep kepVar = new kep(exifInterface);
                    kepVar.m14071g(((gwy) obj6).mo9898d());
                    if (hlnVar.f28270e && (kenVarM4686k = kepVar.f35783a.m4686k(ExifInterface.f7811Y)) != null) {
                        int[] iArrM14057m = kenVarM4686k.m14057m();
                        if (iArrM14057m != null && iArrM14057m.length > 0) {
                            i = iArrM14057m[0];
                        }
                        kenVarM4686k.m14051g(i | 1);
                        kepVar.f35783a.m4695y(kenVarM4686k);
                    }
                    if (hlnVar.f28269d.mo16813g()) {
                        kepVar.m14068d((Location) hlnVar.f28269d.mo16809c());
                    }
                    if (hlnVar.f28271f == gdb.OFF) {
                        kepVar.f35783a.m4689p(ExifInterface.TAG_SOFTWARE);
                    }
                    if (obj8 != null) {
                        guk gukVar = (guk) obj8;
                        if (gukVar.m9779d()) {
                            float f = gukVar.f26436d;
                            StringBuilder sb = new StringBuilder();
                            sb.append("Writing water depth: ");
                            sb.append(f);
                            sb.append(" m");
                            kepVar.m14067c(ExifInterface.f7830aQ, kep.m14065i(Float.valueOf(f), 10L));
                        }
                        if (System.currentTimeMillis() <= gukVar.f26439g + 5000) {
                            float f2 = gukVar.f26438f;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Writing temperature: ");
                            sb2.append(f2);
                            sb2.append(" C");
                            kepVar.m14067c(ExifInterface.f7829aP, kep.m14065i(Float.valueOf(f2), 10L));
                        }
                    }
                    exifInterface = kepVar.f35783a;
                }
                gwy gwyVar = (gwy) obj6;
                gwyVar.f26685u.m13108n(exifInterface);
                ((hjz) gwyVar.f26673i).f28081g = exifInterface;
                hlnVar.m10447a(exifInterface);
                return exifInterface;
            default:
                Object obj9 = this.f23878a;
                Object obj10 = this.f23880c;
                gyx gyxVar = (gyx) this.f23879b;
                gyxVar.name();
                ((gye) obj9).m9969d(new fdg((gyu) obj10, (gyp) obj, gyxVar, 3));
                return null;
        }
    }
}
