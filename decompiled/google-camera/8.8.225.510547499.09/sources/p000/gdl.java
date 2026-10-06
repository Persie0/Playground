package p000;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gdl extends jxc {

    /* JADX INFO: renamed from: a */
    private final boolean f24324a;

    /* JADX INFO: renamed from: b */
    private final boolean f24325b;

    /* JADX WARN: Multi-variable type inference failed */
    public gdl(fvu fvuVar, gcx gcxVar, jwn jwnVar, jwn jwnVar2, jwn jwnVar3, gdw gdwVar, byte[] bArr) {
        super(jwr.m13632b(gcxVar, jwnVar, jwnVar2, jwnVar3, gdwVar.f24346a));
        this.f24324a = fvuVar.mo14541J();
        this.f24325b = fvuVar.mo14558k() == kmq.f36557a;
    }

    /* JADX INFO: renamed from: c */
    private static fxg m9079c(gdd gddVar, boolean z) {
        if (!gddVar.f24271a && !gddVar.f24272b) {
            return gddVar.f24274d ? fxg.HDR_PLUS : fxg.NORMAL;
        }
        if (z) {
            return gddVar.f24274d ? fxg.HDR_PLUS_WITH_TORCH : fxg.NORMAL_WITH_FLASH;
        }
        return gddVar.f24274d ? fxg.HDR_PLUS : fxg.NORMAL;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a1, code lost:
    
        if (r7.f24274d != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c5, code lost:
    
        if (r7.f24273c != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00eb, code lost:
    
        if (r13 != p000.fxg.NORMAL) goto L72;
     */
    @Override // p000.jxc
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final /* bridge */ /* synthetic */ Object mo3833d(Object obj) {
        fxg fxgVarM9079c;
        fxg fxgVar;
        List list = (List) obj;
        gdd gddVar = new gdd(this.f24324a, this.f24325b, ((gcy) list.get(0)).f24252e, ((gdb) list.get(1)).f24269e, ((Boolean) list.get(2)).booleanValue(), ((Boolean) list.get(3)).booleanValue());
        ees eesVar = (ees) list.get(4);
        ees eesVar2 = ees.ON;
        switch (eesVar) {
            case ON:
                fxgVarM9079c = m9079c(gddVar, true);
                break;
            case OFF:
                fxgVarM9079c = m9079c(gddVar, false);
                break;
            case UNKNOWN:
                fxgVarM9079c = m9079c(gddVar, gddVar.f24273c);
                break;
            default:
                throw new IllegalStateException("Should be unreachable for valid Enums. FlashRecommendation=".concat(String.valueOf(String.valueOf(eesVar))));
        }
        if (fxgVarM9079c == fxg.NORMAL_WITH_FLASH) {
            lku.m15613H(gddVar.f24271a);
        } else if (fxgVarM9079c == fxg.HDR_PLUS || fxgVarM9079c == fxg.HDR_PLUS_ZSL || fxgVarM9079c == fxg.HDR_PLUS_WITH_TORCH) {
            lku.m15613H(gddVar.f24274d);
        }
        lku.m15613H(fxgVarM9079c != fxg.HDR_PLUS_ZSL);
        int i = gddVar.f24275e;
        if (i == 1) {
            int i2 = gddVar.f24276f;
            if (i2 != 1) {
                if (i2 == 3) {
                    return fxg.HDR_PLUS;
                }
            }
            return fxg.NORMAL;
        }
        if (i != 3) {
            if (i == 2) {
                int i3 = gddVar.f24276f;
                if (i3 == 1) {
                    if (gddVar.f24271a) {
                    }
                    return fxg.NORMAL;
                }
                if (i3 == 3) {
                    fxgVar = fxg.HDR_PLUS;
                    if (fxgVarM9079c != fxgVar && fxgVarM9079c != fxg.NORMAL) {
                        return fxg.HDR_PLUS_WITH_TORCH;
                    }
                } else {
                    if (!gddVar.f24274d) {
                        return fxgVarM9079c;
                    }
                    fxgVar = fxg.HDR_PLUS_WITH_TORCH;
                    if (fxgVarM9079c != fxgVar && fxgVarM9079c != fxg.NORMAL_WITH_FLASH) {
                        if (fxgVarM9079c != fxg.HDR_PLUS) {
                        }
                        return fxg.HDR_PLUS_ZSL;
                    }
                }
                return fxgVar;
            }
            throw new IllegalStateException("Unknown flash setting, or impossible combination!!");
        }
        int i4 = gddVar.f24276f;
        if (i4 != 1 && (i4 == 3 || gddVar.f24274d)) {
            return fxg.HDR_PLUS_WITH_TORCH;
        }
        return fxg.NORMAL_WITH_FLASH;
    }
}
