package p000;

import android.content.res.Resources;
import android.hardware.camera2.CaptureResult;
import java.util.function.BiFunction;
import java.util.function.Function;
import p021j$.util.function.Function$CC;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gei implements Function {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f24384a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f24385b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ int f24386c;

    public /* synthetic */ gei(geo geoVar, gfb gfbVar, int i) {
        this.f24386c = i;
        this.f24385b = geoVar;
        this.f24384a = gfbVar;
    }

    public /* synthetic */ gei(gfb gfbVar, Resources resources, int i) {
        this.f24386c = i;
        this.f24384a = gfbVar;
        this.f24385b = resources;
    }

    public /* synthetic */ gei(kpp kppVar, String str, int i) {
        this.f24386c = i;
        this.f24385b = kppVar;
        this.f24384a = str;
    }

    public /* synthetic */ gei(ljf ljfVar, kmq kmqVar, int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f24386c = i;
        this.f24385b = ljfVar;
        this.f24384a = kmqVar;
    }

    public /* synthetic */ gei(ngo ngoVar, BiFunction biFunction, int i) {
        this.f24386c = i;
        this.f24385b = ngoVar;
        this.f24384a = biFunction;
    }

    public final /* synthetic */ Function andThen(Function function) {
        switch (this.f24386c) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return Function$CC.$default$andThen(this, function);
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.f24386c) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return Function$CC.$default$compose(this, function);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [gfb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [gfa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kpp] */
    /* JADX WARN: Type inference failed for: r1v5, types: [gfb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, java.util.function.BiFunction] */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f24386c) {
            case 0:
                ?? r0 = this.f24384a;
                gfc gfcVar = (gfc) obj;
                Resources resources = (Resources) this.f24385b;
                return new gfm(gfcVar, r0.mo9149y(gfcVar, resources), r0.mo5831s(gfcVar, resources), r0.mo5830r(gfcVar, resources));
            case 1:
                Object obj2 = this.f24385b;
                Object obj3 = this.f24384a;
                cxk cxkVar = (cxk) obj;
                if (!((djm) ((ljf) obj2).f38372d).m6240o()) {
                    return nmk.NO_STABILIZATION;
                }
                if (obj3 == kmq.f36557a) {
                    return nmk.STEADY_FACE;
                }
                cxk cxkVar2 = cxk.OFF;
                jzf jzfVar = jzf.VIDEO_BUFFER_DELAY;
                ikw ikwVar = ikw.UNINITIALIZED;
                switch (cxkVar.ordinal()) {
                    case 1:
                        return nmk.STANDARD;
                    case 2:
                        return nmk.CINEMATIC;
                    case 3:
                        return nmk.LOCKED;
                    case 4:
                        return nmk.ACTIVE;
                    default:
                        throw new IllegalArgumentException("Not a valid stabilization mode: ".concat(String.valueOf(String.valueOf(cxkVar))));
                }
            case 2:
                return Boolean.valueOf(this.f24384a.mo5777m(this.f24385b));
            case 3:
                ?? r1 = this.f24385b;
                Object obj4 = this.f24384a;
                Integer num = (Integer) r1.mo9517d((CaptureResult.Key) obj);
                return num != null ? num.toString() : obj4;
            default:
                ngo ngoVar = (ngo) this.f24385b;
                return this.f24384a.apply(ngoVar.f42226b.apply(obj), ngoVar.f42227c.apply(obj));
        }
    }
}
