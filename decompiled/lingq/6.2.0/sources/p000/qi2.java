package p000;

import android.graphics.PointF;
import com.airbnb.lottie.model.DocumentData$Justification;
import com.airbnb.lottie.parser.moshi.AbstractC0875a;

/* JADX INFO: loaded from: classes2.dex */
public final class qi2 implements coa {

    /* JADX INFO: renamed from: a */
    public static final qi2 f57805a = new qi2();

    /* JADX INFO: renamed from: b */
    public static final p33 f57806b = p33.m18864S("t", "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of", "ps", "sz");

    @Override // p000.coa
    /* JADX INFO: renamed from: g */
    public final Object mo87g(AbstractC0875a abstractC0875a, float f) {
        DocumentData$Justification documentData$Justification = DocumentData$Justification.CENTER;
        abstractC0875a.mo5038b();
        String strMo5046x = null;
        float fMo5044r = 0.0f;
        float fMo5044r2 = 0.0f;
        float fMo5044r3 = 0.0f;
        float fMo5044r4 = 0.0f;
        int iMo5045u = 0;
        int iM17977a = 0;
        int iM17977a2 = 0;
        boolean zMo5043q = true;
        String strMo5046x2 = null;
        PointF pointF = null;
        PointF pointF2 = null;
        while (abstractC0875a.mo5042p()) {
            switch (abstractC0875a.mo5033J(f57806b)) {
                case 0:
                    strMo5046x = abstractC0875a.mo5046x();
                    break;
                case 1:
                    strMo5046x2 = abstractC0875a.mo5046x();
                    break;
                case 2:
                    fMo5044r = (float) abstractC0875a.mo5044r();
                    break;
                case 3:
                    int iMo5045u2 = abstractC0875a.mo5045u();
                    DocumentData$Justification documentData$Justification2 = DocumentData$Justification.CENTER;
                    documentData$Justification = (iMo5045u2 <= documentData$Justification2.ordinal() && iMo5045u2 >= 0) ? DocumentData$Justification.values()[iMo5045u2] : documentData$Justification2;
                    break;
                case 4:
                    iMo5045u = abstractC0875a.mo5045u();
                    break;
                case 5:
                    fMo5044r2 = (float) abstractC0875a.mo5044r();
                    break;
                case 6:
                    fMo5044r3 = (float) abstractC0875a.mo5044r();
                    break;
                case 7:
                    iM17977a = og4.m17977a(abstractC0875a);
                    break;
                case 8:
                    iM17977a2 = og4.m17977a(abstractC0875a);
                    break;
                case 9:
                    fMo5044r4 = (float) abstractC0875a.mo5044r();
                    break;
                case 10:
                    zMo5043q = abstractC0875a.mo5043q();
                    break;
                case 11:
                    abstractC0875a.mo5037a();
                    pointF = new PointF(((float) abstractC0875a.mo5044r()) * f, ((float) abstractC0875a.mo5044r()) * f);
                    abstractC0875a.mo5039c();
                    break;
                case 12:
                    abstractC0875a.mo5037a();
                    pointF2 = new PointF(((float) abstractC0875a.mo5044r()) * f, ((float) abstractC0875a.mo5044r()) * f);
                    abstractC0875a.mo5039c();
                    break;
                default:
                    abstractC0875a.mo5034N();
                    abstractC0875a.mo5035R();
                    break;
            }
        }
        abstractC0875a.mo5040e();
        pi2 pi2Var = new pi2();
        pi2Var.f56229a = strMo5046x;
        pi2Var.f56230b = strMo5046x2;
        pi2Var.f56231c = fMo5044r;
        pi2Var.f56232d = documentData$Justification;
        pi2Var.f56233e = iMo5045u;
        pi2Var.f56234f = fMo5044r2;
        pi2Var.f56235g = fMo5044r3;
        pi2Var.f56236h = iM17977a;
        pi2Var.f56237i = iM17977a2;
        pi2Var.f56238j = fMo5044r4;
        pi2Var.f56239k = zMo5043q;
        pi2Var.f56240l = pointF;
        pi2Var.f56241m = pointF2;
        return pi2Var;
    }
}
