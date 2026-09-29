package p343qi;

import android.content.DialogInterface;
import android.widget.Toast;
import androidx.fragment.app.C0964m;
import cm.InterfaceC2041a;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.goals.InstagramShareFragment;
import com.lingq.p055ui.home.HomeFragment;
import com.lingq.p055ui.home.HomeViewModel;
import com.lingq.p055ui.home.vocabulary.VocabularyFragment;
import com.lingq.p055ui.settings.DataStoreSettingsFragment;
import com.linguist.R;
import dm.C5207g;
import km.InterfaceC6727j;
import p537zi.C10507q;
import sl.C9072e;

/* JADX INFO: renamed from: qi.f */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC8634f implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f46172a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f46173b;

    public /* synthetic */ DialogInterfaceOnClickListenerC8634f(int i10, Object obj) {
        this.f46172a = i10;
        this.f46173b = obj;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        int i11 = this.f46172a;
        Object obj = this.f46173b;
        switch (i11) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                InstagramShareFragment instagramShareFragment = (InstagramShareFragment) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr = InstagramShareFragment.f22618V0;
                C5207g.m11111f(instagramShareFragment, "this$0");
                C0964m c0964m = instagramShareFragment.f22623U0;
                if (c0964m != null) {
                    c0964m.mo844a("android.permission.WRITE_EXTERNAL_STORAGE");
                    return;
                } else {
                    C5207g.m11117l("requestPermissionLauncher");
                    throw null;
                }
            case 1:
                HomeFragment.m9766o0((HomeFragment) obj, dialogInterface, i10);
                return;
            case 2:
                C10507q c10507q = (C10507q) obj;
                C5207g.m11111f(c10507q, "this$0");
                c10507q.f52457c.mo1337m0(c10507q.f52460f, c10507q.f52461g);
                Toast.makeText(c10507q.f52455a, R.string.report_successfully_flagged, 0).show();
                dialogInterface.dismiss();
                return;
            case 3:
                VocabularyFragment vocabularyFragment = (VocabularyFragment) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr2 = VocabularyFragment.f26133G0;
                C5207g.m11111f(vocabularyFragment, "this$0");
                C0964m c0964m2 = vocabularyFragment.f26138E0;
                if (c0964m2 != null) {
                    c0964m2.mo844a("android.permission.WRITE_EXTERNAL_STORAGE");
                    return;
                } else {
                    C5207g.m11117l("requestPermissionLauncher");
                    throw null;
                }
            case 4:
                DataStoreSettingsFragment dataStoreSettingsFragment = (DataStoreSettingsFragment) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr3 = DataStoreSettingsFragment.f30933F0;
                C5207g.m11111f(dataStoreSettingsFragment, "this$0");
                ((HomeViewModel) dataStoreSettingsFragment.f30936C0.getValue()).f22745U.mo14371k(C9072e.f47360a);
                return;
            default:
                InterfaceC2041a interfaceC2041a = (InterfaceC2041a) obj;
                C5207g.m11111f(interfaceC2041a, "$onPositiveButtonClicked");
                interfaceC2041a.mo807E();
                return;
        }
    }
}
