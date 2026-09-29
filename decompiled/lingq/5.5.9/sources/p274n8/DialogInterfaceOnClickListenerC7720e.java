package p274n8;

import android.app.Dialog;
import android.content.DialogInterface;
import android.view.View;
import android.widget.ArrayAdapter;
import androidx.fragment.app.C0964m;
import cm.InterfaceC2041a;
import com.android.installreferrer.api.InstallReferrerClient;
import com.facebook.login.DeviceAuthDialog;
import com.facebook.login.LoginClient;
import com.lingq.p055ui.home.language.stats.StatsShareFragment;
import com.lingq.p055ui.lesson.edit.SentenceEditPageFragment;
import com.lingq.shared.uimodel.language.UserDictionaryLocale;
import com.lingq.util.C4924a;
import dm.C5207g;
import java.util.Iterator;
import java.util.List;
import km.InterfaceC6727j;

/* JADX INFO: renamed from: n8.e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC7720e implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f42259a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f42260b;

    public /* synthetic */ DialogInterfaceOnClickListenerC7720e(int i10, Object obj) {
        this.f42259a = i10;
        this.f42260b = obj;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        Object obj;
        int i11 = this.f42259a;
        UserDictionaryLocale userDictionaryLocale = null;
        Object obj2 = this.f42260b;
        switch (i11) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                DeviceAuthDialog deviceAuthDialog = (DeviceAuthDialog) obj2;
                int i12 = DeviceAuthDialog.f11572W0;
                C5207g.m11111f(deviceAuthDialog, "this$0");
                View viewM6694w0 = deviceAuthDialog.m6694w0(false);
                Dialog dialog = deviceAuthDialog.f6328G0;
                if (dialog != null) {
                    dialog.setContentView(viewM6694w0);
                }
                LoginClient.Request request = deviceAuthDialog.f11583V0;
                if (request == null) {
                    return;
                }
                deviceAuthDialog.m6692D0(request);
                return;
            case 1:
                StatsShareFragment statsShareFragment = (StatsShareFragment) obj2;
                InterfaceC6727j<Object>[] interfaceC6727jArr = StatsShareFragment.f24390T0;
                C5207g.m11111f(statsShareFragment, "this$0");
                C0964m c0964m = statsShareFragment.f24393S0;
                if (c0964m != null) {
                    c0964m.mo844a("android.permission.WRITE_EXTERNAL_STORAGE");
                    return;
                } else {
                    C5207g.m11117l("requestPermissionLauncher");
                    throw null;
                }
            case 2:
                SentenceEditPageFragment sentenceEditPageFragment = (SentenceEditPageFragment) obj2;
                SentenceEditPageFragment.C4294a c4294a = SentenceEditPageFragment.f27986E0;
                C5207g.m11111f(sentenceEditPageFragment, "this$0");
                List list = (List) sentenceEditPageFragment.m10179o0().f28020M.getValue();
                UserDictionaryLocale userDictionaryLocale2 = userDictionaryLocale;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Object next = it.next();
                            String strM10439R = C4924a.m10439R(sentenceEditPageFragment.m3578a0(), ((UserDictionaryLocale) next).f21721a);
                            ArrayAdapter<String> arrayAdapter = sentenceEditPageFragment.f27991D0;
                            if (arrayAdapter == null) {
                                C5207g.m11117l("localesAdapter");
                                throw null;
                            }
                            if (C5207g.m11106a(strM10439R, arrayAdapter.getItem(i10))) {
                                obj = next;
                            }
                        } else {
                            obj = userDictionaryLocale;
                        }
                    }
                    userDictionaryLocale2 = (UserDictionaryLocale) obj;
                }
                if (userDictionaryLocale2 != null) {
                    sentenceEditPageFragment.m10179o0().m10180l2(userDictionaryLocale2.f21721a, "");
                }
                dialogInterface.dismiss();
                return;
            default:
                InterfaceC2041a interfaceC2041a = (InterfaceC2041a) obj2;
                C5207g.m11111f(interfaceC2041a, "$onNegativeButtonClicked");
                interfaceC2041a.mo807E();
                return;
        }
    }
}
