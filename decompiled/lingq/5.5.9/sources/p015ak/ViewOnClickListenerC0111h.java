package p015ak;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Parcelable;
import android.view.View;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.session.RegisterFragment;
import com.lingq.p055ui.session.magiclink.CheckEmailFragment;
import com.lingq.p055ui.token.ViewLearnProgress;
import com.lingq.p055ui.token.dictionaries.DictionariesManageFragment;
import com.lingq.p055ui.upgrade.UpgradeFragment;
import com.lingq.shared.uimodel.CardStatus;
import com.linguist.R;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import km.InterfaceC6727j;
import p032bk.C1604a;

/* JADX INFO: renamed from: ak.h */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC0111h implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f276a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f277b;

    public /* synthetic */ ViewOnClickListenerC0111h(int i10, Object obj) {
        this.f276a = i10;
        this.f277b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f276a;
        Object obj = this.f277b;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                RegisterFragment registerFragment = (RegisterFragment) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr = RegisterFragment.f30733J0;
                C5207g.m11111f(registerFragment, "this$0");
                registerFragment.m10340n0(1);
                break;
            case 1:
                CheckEmailFragment checkEmailFragment = (CheckEmailFragment) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr2 = CheckEmailFragment.f30844E0;
                C5207g.m11111f(checkEmailFragment, "this$0");
                ArrayList arrayList = new ArrayList();
                Intent intent = new Intent("android.intent.action.SENDTO");
                intent.setData(Uri.parse("mailto:"));
                List<ResolveInfo> listQueryIntentActivities = checkEmailFragment.m3578a0().getPackageManager().queryIntentActivities(intent, 131072);
                C5207g.m11110e(listQueryIntentActivities, "requireContext().package…nager.MATCH_ALL\n        )");
                Iterator<ResolveInfo> it = listQueryIntentActivities.iterator();
                while (it.hasNext()) {
                    arrayList.add(checkEmailFragment.m3578a0().getPackageManager().getLaunchIntentForPackage(it.next().activityInfo.packageName));
                }
                Intent intent2 = new Intent();
                Locale locale = Locale.getDefault();
                String strM3600t = checkEmailFragment.m3600t(R.string.login_email_chooser);
                C5207g.m11110e(strM3600t, "getString(R.string.login_email_chooser)");
                String str = String.format(locale, strM3600t, Arrays.copyOf(new Object[]{((C1604a) checkEmailFragment.f30847C0.getValue()).f9096a}, 1));
                C5207g.m11110e(str, "format(locale, format, *args)");
                Intent intentCreateChooser = Intent.createChooser(intent2, str);
                intentCreateChooser.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList.toArray(new Intent[0]));
                checkEmailFragment.m3595l0(intentCreateChooser);
                break;
            case 2:
                ViewLearnProgress viewLearnProgress = (ViewLearnProgress) obj;
                int i11 = ViewLearnProgress.f31718c;
                C5207g.m11111f(viewLearnProgress, "this$0");
                ViewLearnProgress.InterfaceC4863a interfaceC4863a = viewLearnProgress.f31720b;
                if (interfaceC4863a != null) {
                    interfaceC4863a.mo10269a(CardStatus.Learned.getValue());
                }
                break;
            case 3:
                DictionariesManageFragment dictionariesManageFragment = (DictionariesManageFragment) obj;
                DictionariesManageFragment.C4877a c4877a = DictionariesManageFragment.f31774U0;
                C5207g.m11111f(dictionariesManageFragment, "this$0");
                dictionariesManageFragment.mo3766m0();
                break;
            default:
                UpgradeFragment upgradeFragment = (UpgradeFragment) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr3 = UpgradeFragment.f31981F0;
                C5207g.m11111f(upgradeFragment, "this$0");
                upgradeFragment.m10410r0();
                break;
        }
    }
}
