package p000;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.IntentSender;
import android.widget.Toast;
import androidx.activity.result.IntentSenderRequest;
import com.lingq.core.p012ui.R$string;
import com.lingq.feature.imports.UserImportFragment;
import com.lingq.feature.imports.data.UserImportDetailType;
import kotlinx.coroutines.flow.C3244l;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nka implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f52892a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ UserImportFragment f52893b;

    public /* synthetic */ nka(UserImportFragment userImportFragment, int i) {
        this.f52892a = i;
        this.f52893b = userImportFragment;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        Object value;
        int i = this.f52892a;
        xfa xfaVar = xfa.f68157a;
        UserImportFragment userImportFragment = this.f52893b;
        switch (i) {
            case 0:
                IntentSender intentSender = (IntentSender) obj;
                try {
                    ad3 ad3Var = userImportFragment.f26004F0;
                    if (ad3Var != null) {
                        intentSender.getClass();
                        ad3Var.mo276a(new IntentSenderRequest(intentSender, null, 0, 0));
                    }
                } catch (ActivityNotFoundException e) {
                    r43.m20289a().m20290b(e);
                    C3244l c3244l = userImportFragment.m8997R0().f26184p;
                    do {
                        value = c3244l.getValue();
                        ((Boolean) value).getClass();
                    } while (!c3244l.m15570h(value, Boolean.FALSE));
                    Toast.makeText(userImportFragment.m2090R(), userImportFragment.m2111m(R$string.texts_try_later), 1).show();
                }
                break;
            default:
                vg6 vg6Var = (vg6) obj;
                vg6Var.getClass();
                if (vg6Var.equals(tg6.f62255a)) {
                    b34.m3244j(userImportFragment).m22689f();
                } else if (vg6Var.equals(fh6.f39108a)) {
                    ad3 ad3Var2 = userImportFragment.f26003E0;
                    if (ad3Var2 != null) {
                        Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
                        intent.setType("*/*");
                        intent.putExtra("android.intent.extra.MIME_TYPES", new String[]{"application/pdf", "application/epub+zip", "text/plain", "application/x-subrip", "application/x-mobipocket-ebook", "application/vnd.openxmlformats-officedocument.wordprocessingml.document", "audio/mpeg", "audio/mp4", "audio/x-m4a", "audio/x-wav", "application/ttml+xml"});
                        intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                        ad3Var2.mo276a(intent);
                    }
                    userImportFragment.m8997R0().m9016W2();
                } else if (vg6Var.equals(hh6.f42374a)) {
                    userImportFragment.m8997R0().m9016W2();
                    userImportFragment.m8998S0();
                } else if (vg6Var instanceof ih6) {
                    rka rkaVar = ska.Companion;
                    UserImportDetailType userImportDetailType = ((ih6) vg6Var).f44112a;
                    rkaVar.getClass();
                    userImportDetailType.getClass();
                    jfa.m14428k(b34.m3244j(userImportFragment), new qka(userImportDetailType), null);
                } else if (vg6Var instanceof gh6) {
                    mbd.m16755c(userImportFragment.m2089Q(), ((gh6) vg6Var).f40821a, null, 30);
                }
                break;
        }
        return xfaVar;
        return xfaVar;
    }
}
