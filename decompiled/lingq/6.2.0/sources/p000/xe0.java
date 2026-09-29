package p000;

import android.content.Intent;
import androidx.lifecycle.compose.AbstractC0711a;
import com.lingq.core.common.util.AbstractC1263a;
import com.lingq.feature.challenges.bookchallenge.BookChallengeChooserParentFragment;
import kotlinx.coroutines.flow.C3244l;
import p000.ad3;
import p000.df0;
import p000.gm5;
import p000.je0;
import p000.ke0;
import p000.lda;
import p000.le0;
import p000.me0;
import p000.ne0;
import p000.oe0;
import p000.pya;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class xe0 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f68114a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ BookChallengeChooserParentFragment f68115b;

    public /* synthetic */ xe0(BookChallengeChooserParentFragment bookChallengeChooserParentFragment, int i) {
        this.f68114a = i;
        this.f68115b = bookChallengeChooserParentFragment;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f68114a;
        xfa xfaVar = xfa.f68157a;
        final BookChallengeChooserParentFragment bookChallengeChooserParentFragment = this.f68115b;
        int i2 = 1;
        ye1 ye1Var = (ye1) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    tj3Var.m22102U();
                } else {
                    fy9.m12246a(false, null, ci8.m4703P(988306569, new xe0(bookChallengeChooserParentFragment, i2), tj3Var), tj3Var, 384);
                }
                break;
            default:
                tj3 tj3Var2 = (tj3) ye1Var;
                if (!tj3Var2.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    tj3Var2.m22102U();
                } else {
                    df0 df0Var = (df0) AbstractC0711a.m2513c(bookChallengeChooserParentFragment.m8811A0().f24550j, tj3Var2).getValue();
                    boolean zM22124i = tj3Var2.m22124i(bookChallengeChooserParentFragment);
                    Object objM22097O = tj3Var2.m22097O();
                    if (zM22124i || objM22097O == we1.f66679a) {
                        objM22097O = new vi3() { // from class: com.lingq.feature.challenges.bookchallenge.b
                            @Override // p000.vi3
                            public final Object invoke(Object obj3) {
                                Object value;
                                oe0 oe0Var = (oe0) obj3;
                                oe0Var.getClass();
                                boolean z = oe0Var instanceof me0;
                                BookChallengeChooserParentFragment bookChallengeChooserParentFragment2 = bookChallengeChooserParentFragment;
                                if (z) {
                                    bookChallengeChooserParentFragment2.m8811A0().m8812V2(((me0) oe0Var).f51192a);
                                } else if (oe0Var instanceof je0) {
                                    C1972c c1972cM8811A0 = bookChallengeChooserParentFragment2.m8811A0();
                                    pya pyaVar = ((je0) oe0Var).f45453a;
                                    pyaVar.getClass();
                                    c1972cM8811A0.f24551k = null;
                                    C3244l c3244l = c1972cM8811A0.f24549i;
                                    do {
                                        value = c3244l.getValue();
                                    } while (!c3244l.m15570h(value, df0.m10318a((df0) value, null, null, null, pyaVar, null, false, null, 0, 999)));
                                } else if (oe0Var.equals(le0.f49538a)) {
                                    ad3 ad3Var = bookChallengeChooserParentFragment2.f24513U0;
                                    Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
                                    intent.setType("*/*");
                                    intent.putExtra("android.intent.extra.MIME_TYPES", new String[]{"application/pdf", "application/epub+zip", "text/plain", "application/x-subrip", "application/x-mobipocket-ebook", "application/vnd.openxmlformats-officedocument.wordprocessingml.document", "application/ttml+xml"});
                                    intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", false);
                                    ad3Var.mo276a(intent);
                                } else if (oe0Var.equals(ne0.f52632a)) {
                                    C1972c c1972cM8811A1 = bookChallengeChooserParentFragment2.m8811A0();
                                    C3244l c3244l2 = c1972cM8811A1.f24549i;
                                    pya pyaVar2 = ((df0) c3244l2.getValue()).f35539d;
                                    String str = ((df0) c3244l2.getValue()).f35540e;
                                    byte[] bArr = c1972cM8811A1.f24551k;
                                    if (pyaVar2 != null || (str != null && bArr != null)) {
                                        AbstractC1263a.m7047b(lda.m16103C(c1972cM8811A1), c1972cM8811A1.f24547g, "submitBookChallengeBook", new BookChallengeChooserParentViewModel$submit$1(c1972cM8811A1, pyaVar2, str, bArr, null));
                                    }
                                } else {
                                    if (!oe0Var.equals(ke0.f47085a)) {
                                        gm5.m12750e();
                                        return null;
                                    }
                                    bookChallengeChooserParentFragment2.mo3657c0();
                                }
                                return xfa.f68157a;
                            }
                        };
                        tj3Var2.m22131l0(objM22097O);
                    }
                    u4d.m22466a(df0Var, (vi3) objM22097O, tj3Var2, 0);
                }
                break;
        }
        return xfaVar;
    }
}
