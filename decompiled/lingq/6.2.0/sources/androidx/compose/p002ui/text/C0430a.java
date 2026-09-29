package androidx.compose.p002ui.text;

import p000.C3378nn;
import p000.de5;
import p000.dm8;
import p000.ee5;
import p000.el8;
import p000.gm5;
import p000.he9;
import p000.ij6;
import p000.ipa;
import p000.j37;
import p000.lja;
import p000.ok9;
import p000.vz1;
import p000.zi3;

/* JADX INFO: renamed from: androidx.compose.ui.text.a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0430a implements zi3 {
    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        AnnotationType annotationType;
        Object objM10482a;
        el8 el8Var = (el8) obj;
        C3378nn c3378nn = (C3378nn) obj2;
        Object obj3 = c3378nn.f52979a;
        if (obj3 instanceof j37) {
            annotationType = AnnotationType.Paragraph;
        } else if (obj3 instanceof he9) {
            annotationType = AnnotationType.Span;
        } else if (obj3 instanceof ipa) {
            annotationType = AnnotationType.VerbatimTts;
        } else if (obj3 instanceof lja) {
            annotationType = AnnotationType.Url;
        } else if (obj3 instanceof ee5) {
            annotationType = AnnotationType.Link;
        } else if (obj3 instanceof de5) {
            annotationType = AnnotationType.Clickable;
        } else {
            if (!(obj3 instanceof ok9)) {
                ij6.m13946b();
                return null;
            }
            annotationType = AnnotationType.String;
        }
        switch (AbstractC0432c.f5042a[annotationType.ordinal()]) {
            case 1:
                obj3.getClass();
                objM10482a = dm8.m10482a((j37) obj3, dm8.f35853h, el8Var);
                break;
            case 2:
                obj3.getClass();
                objM10482a = dm8.m10482a((he9) obj3, dm8.f35854i, el8Var);
                break;
            case 3:
                obj3.getClass();
                objM10482a = dm8.m10482a((ipa) obj3, dm8.f35849d, el8Var);
                break;
            case 4:
                obj3.getClass();
                objM10482a = dm8.m10482a((lja) obj3, dm8.f35850e, el8Var);
                break;
            case 5:
                obj3.getClass();
                objM10482a = dm8.m10482a((ee5) obj3, dm8.f35851f, el8Var);
                break;
            case 6:
                obj3.getClass();
                objM10482a = dm8.m10482a((de5) obj3, dm8.f35852g, el8Var);
                break;
            case 7:
                obj3.getClass();
                objM10482a = ((ok9) obj3).f54498a;
                break;
            default:
                gm5.m12750e();
                return null;
        }
        return vz1.m23627e(annotationType, objM10482a, Integer.valueOf(c3378nn.f52980b), Integer.valueOf(c3378nn.f52981c), c3378nn.f52982d);
    }
}
