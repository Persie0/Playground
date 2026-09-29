package p000;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.compose.p002ui.platform.AbstractC0394f;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.lingq.core.analytics.embedded.EmbeddedMessage;
import com.lingq.core.domain.model.lesson.LessonWord;
import com.lingq.core.domain.model.token.TokenMeaning;
import com.lingq.feature.reader.R$id;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Map;
import kotlinx.datetime.format.Padding;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ry4 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f60038a;

    public /* synthetic */ ry4(int i) {
        this.f60038a = i;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) throws Exception {
        int i = this.f60038a;
        Context context = null;
        xfa xfaVar = xfa.f68157a;
        switch (i) {
            case 0:
                LessonWord lessonWord = (LessonWord) obj;
                lessonWord.getClass();
                return lessonWord.f19314a;
            case 1:
                ((w65) obj).getClass();
                return xfaVar;
            case 2:
                ((w65) obj).getClass();
                return xfaVar;
            case 3:
                xd6 xd6Var = (xd6) obj;
                xd6Var.getClass();
                xd6Var.f68103d = R$id.fragment_deal_blue_words_complete;
                xd6Var.f68104e = true;
                xd6Var.f68105f = false;
                return xfaVar;
            case 4:
                LessonWord lessonWord2 = (LessonWord) obj;
                lessonWord2.getClass();
                return lessonWord2.f19314a;
            case 5:
                w65 w65Var = (w65) obj;
                w65Var.getClass();
                return w65Var.mo8037d();
            case 6:
                ly1 ly1Var = (ly1) obj;
                ly1Var.getClass();
                return ly1Var.m16571a(null);
            case 7:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                return Boolean.valueOf(!vk9.m23391n0((CharSequence) entry.getValue()));
            case 8:
                q98 q98Var = (q98) obj;
                q98Var.getClass();
                q98Var.m19818i(1);
                return xfaVar;
            case 9:
                q98 q98Var2 = (q98) obj;
                q98Var2.getClass();
                q98Var2.m19821m(180.0f);
                q98Var2.m19828x(k9a.f46915b);
                return xfaVar;
            case 10:
                w65 w65Var2 = (w65) obj;
                w65Var2.getClass();
                return w65Var2.mo8037d();
            case 11:
                bk8 bk8Var = (bk8) obj;
                bk8Var.getClass();
                ik8 ik8VarMo2873e0 = bk8Var.mo2873e0("DELETE FROM LibraryDownloadEntity");
                try {
                    ik8VarMo2873e0.mo2876a0();
                    return xfaVar;
                } finally {
                    ik8VarMo2873e0.close();
                }
            case 12:
                EmbeddedMessage embeddedMessage = (EmbeddedMessage) obj;
                embeddedMessage.getClass();
                return embeddedMessage.m7035b().m7040a();
            case 13:
                float fFloatValue = ((Float) obj).floatValue();
                if (fFloatValue < 1000.0f) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(fFloatValue);
                    return sb.toString();
                }
                double d = fFloatValue;
                int iLog = (int) (Math.log(d) / Math.log(1000.0d));
                DecimalFormat decimalFormat = fFloatValue > 1000000.0f ? new DecimalFormat("#.##") : new DecimalFormat("#.#");
                decimalFormat.setRoundingMode(RoundingMode.DOWN);
                return String.format("%s%c", Arrays.copyOf(new Object[]{decimalFormat.format(d / Math.pow(1000.0d, iLog)), Character.valueOf("kMBT".charAt(iLog - 1))}, 2));
            case 14:
                vu4 vu4Var = (vu4) obj;
                vu4Var.getClass();
                vu4.m23546i(vu4Var, xd5.f68099a.size(), new ry4(15), syb.f61638d, 4);
                return xfaVar;
            case 15:
                Integer num = (Integer) obj;
                num.intValue();
                return num;
            case 16:
                le5 le5Var = (le5) obj;
                le5Var.getClass();
                pk9 pk9Var = le5Var.f49545C;
                if (pk9Var instanceof le5) {
                    return (le5) pk9Var;
                }
                return null;
            case 17:
                le5 le5Var2 = (le5) obj;
                le5Var2.getClass();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(le5Var2.f49543A);
                sb2.append('=');
                sb2.append(le5Var2.f49544B);
                return sb2.toString();
            case 18:
                float f = of5.f54273a;
                return xfaVar;
            case 19:
                for (Context baseContext = (Context) ((sf1) obj).mo1058A(AbstractC0394f.f4761b); baseContext instanceof ContextWrapper; baseContext = ((ContextWrapper) baseContext).getBaseContext()) {
                    if (baseContext instanceof Activity) {
                        context = baseContext;
                        return (Activity) context;
                    }
                }
                return (Activity) context;
            case 20:
                bi5 bi5Var = (bi5) obj;
                bi5Var.getClass();
                mad.m16721c(bi5Var, 't');
                return xfaVar;
            case 21:
                bi5 bi5Var2 = (bi5) obj;
                bi5Var2.getClass();
                mad.m16721c(bi5Var2, 'T');
                return xfaVar;
            case 22:
                ((h12) obj).getClass();
                return xfaVar;
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                h12 h12Var = (h12) obj;
                h12Var.getClass();
                mad.m16721c(h12Var, ':');
                Padding padding = Padding.ZERO;
                padding.getClass();
                ((InterfaceC0832c2) h12Var).mo3731d(new ta0(new lt8(padding)));
                mad.m16723e(h12Var, "", new ry4(24));
                return xfaVar;
            case 24:
                h12 h12Var2 = (h12) obj;
                h12Var2.getClass();
                mad.m16721c(h12Var2, '.');
                ((InterfaceC0832c2) h12Var2).mo3731d(new ta0(new zc3()));
                return xfaVar;
            case 25:
                ((zu8) obj).getClass();
                return xfaVar;
            case 26:
                ((ia4) obj).getClass();
                return xfaVar;
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                ((Long) obj).getClass();
                return xfaVar;
            case 28:
                TokenMeaning tokenMeaning = (TokenMeaning) obj;
                tokenMeaning.getClass();
                String str = tokenMeaning.f19596c;
                return str != null ? str : "";
            default:
                ((zu8) obj).getClass();
                return xfaVar;
        }
    }
}
