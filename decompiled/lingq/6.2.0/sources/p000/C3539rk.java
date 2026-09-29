package p000;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.Toast;
import androidx.compose.material3.AbstractC0266w;
import androidx.compose.material3.C0253l;
import androidx.compose.runtime.AbstractC0278f;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import androidx.glance.appwidget.C0656d;
import com.lingq.core.domain.dictionaries.C1376b;
import com.lingq.core.p012ui.R$string;
import com.lingq.core.p012ui.UpgradeReason;
import com.lingq.core.premium.FreeTrialFragment;
import com.lingq.feature.chat.C2009m;
import com.lingq.feature.collections.C2034d;
import com.lingq.feature.playlist.C2251a;
import com.lingq.feature.reader.stats.C2535j;
import com.lingq.feature.statistics.LanguageStatsAllFragment;
import com.lingq.feature.statistics.LanguageStatsBadgesFragment;
import com.lingq.feature.statistics.LanguageStatsDetailsFragment;
import com.lingq.feature.statistics.domain.C2816c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import okhttp3.internal.http2.ErrorCode;

/* JADX INFO: renamed from: rk */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3539rk implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f59418a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f59419b;

    public /* synthetic */ C3539rk(Object obj, int i) {
        this.f59418a = i;
        this.f59419b = obj;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        int i = this.f59418a;
        xfa xfaVar = xfa.f68157a;
        Object obj = this.f59419b;
        switch (i) {
            case 0:
                return ((dt9) obj).mo10627U();
            case 1:
                ((xc9) ((C0656d) obj).f6003j).getValue();
                return xfaVar;
            case 2:
                return Float.valueOf(l70.m15944g((float) (((de0) obj).f35489e / 100.0d), 0.0f, 1.0f));
            case 3:
                return Float.valueOf(((float) ((jr0) obj).f46023c) / 100.0f);
            case 4:
                ((C2009m) obj).m8925b3();
                return xfaVar;
            case 5:
                Toast.makeText((Context) obj, R$string.lingq_connect_warning, 0).show();
                return xfaVar;
            case 6:
                ((C2034d) obj).m8945Z2(n51.f52357a);
                return xfaVar;
            case 7:
                return ((ArrayList) obj).iterator();
            case 8:
                ((uc1) obj).reportFullyDrawn();
                return xfaVar;
            case 9:
                return ((C3156jq) obj).mo4512m(":memory:");
            case 10:
                ((C2251a) obj).mo3737M1(UpgradeReason.PLAYLISTS);
                return xfaVar;
            case 11:
                vs1 vs1Var = (vs1) obj;
                int i2 = vs1Var.f65837e;
                return Float.valueOf(i2 > 0 ? l70.m15944g(vs1Var.f65836d / i2, 0.0f, 1.0f) : 0.0f);
            case 12:
                ((g77) obj).mo12409o();
                return xfaVar;
            case 13:
                Object obj2 = ((List) obj).get(2);
                obj2.getClass();
                return (Integer) obj2;
            case 14:
                ((nt9) obj).close();
                return xfaVar;
            case 15:
                C0253l c0253l = (C0253l) obj;
                fb2 fb2Var = (fb2) ((xc9) c0253l.f3553c).getValue();
                if (fb2Var != null) {
                    fda fdaVar = AbstractC0266w.f3635a;
                    return Float.valueOf(fb2Var.mo912g0(400.0f));
                }
                v63.m23135m("The density on DrawerState (", c0253l, ") was not set. Did you use DrawerState with the ModalNavigationDrawer or DismissibleNavigationDrawer composables?");
                return null;
            case 16:
                String str = ((c03) obj).f9248a;
                int length = str.length();
                return AbstractC0278f.m1260j(new vv9(str, 4, eh0.m11127g(length, length)));
            case 17:
                b34.m3244j((FreeTrialFragment) obj).m22689f();
                return xfaVar;
            case 18:
                return ((C1376b) obj).f18635a.m7329c();
            case 19:
                return ((C2816c) obj).f33435c.m8208a();
            case 20:
                return ((C2816c) obj).f33435c.m8208a();
            case 21:
                return ((C2816c) obj).f33435c.m8208a();
            case 22:
                mw3 mw3Var = (mw3) obj;
                mw3Var.getClass();
                try {
                    mw3Var.f51923R.m22965p(2, 0, false);
                    break;
                } catch (IOException e) {
                    ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
                    mw3Var.m17065a(errorCode, errorCode, e);
                }
                return xfaVar;
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                Object systemService = ((View) ((b64) obj).f8006a).getContext().getSystemService("input_method");
                systemService.getClass();
                return (InputMethodManager) systemService;
            case 24:
                b34.m3244j((LanguageStatsAllFragment) obj).m22689f();
                return xfaVar;
            case 25:
                b34.m3244j((LanguageStatsBadgesFragment) obj).m22689f();
                return xfaVar;
            case 26:
                b34.m3244j((LanguageStatsDetailsFragment) obj).m22689f();
                return xfaVar;
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                ((qn4) obj).f57976b.mo0a();
                return xfaVar;
            case 28:
                return new BaseInputConnection(((zw4) obj).f72297a, false);
            default:
                ((C2535j) obj).f30820c.mo9326g2(xx4.f68925a);
                return xfaVar;
        }
    }
}
