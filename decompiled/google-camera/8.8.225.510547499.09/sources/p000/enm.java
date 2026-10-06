package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.camera.bottombar.BottomBarListener;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.p014ui.bottomsheet.BottomSheetButton;
import com.google.android.apps.camera.p014ui.eduimageview.EduImageView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class enm extends BottomBarListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ enn f14763a;

    public enm(enn ennVar) {
        this.f14763a = ennVar;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [hai, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [hah, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, jwn] */
    @Override // com.google.android.apps.camera.bottombar.BottomBarListener
    public final void onJupiterButtonClicked() {
        if (((Boolean) this.f14763a.f14766c.mo3831be()).booleanValue()) {
            enn ennVar = this.f14763a;
            if (((Boolean) ennVar.f14766c.mo3831be()).booleanValue()) {
                ennVar.f14765b.m7566a();
                return;
            }
            return;
        }
        gjj gjjVar = this.f14763a.f14767d;
        if (((Boolean) gjjVar.f24999b.mo10031c(gzy.f27042az)).booleanValue()) {
            this.f14763a.m7565c();
            return;
        }
        Object obj = gjjVar.f25006i;
        Drawable drawable = ((Context) gjjVar.f25007j).getDrawable(C0100R.drawable.jupiter_edu);
        drawable.getClass();
        ((EduImageView) obj).m4361b(drawable, ((Context) gjjVar.f25007j).getString(C0100R.string.jupiter_edu_image_desc));
        ((BottomSheetButton) gjjVar.f25002e).setText(((Context) gjjVar.f25007j).getString(C0100R.string.jupiter_bottom_sheet_entry_confirm_button));
        if (((hyd) gjjVar.f24998a.mo3831be()).equals(jiy.m13264Z())) {
            ((TextView) gjjVar.f25000c).setText(((Context) gjjVar.f25007j).getString(C0100R.string.jupiter_bottom_sheet_fold_desc));
        } else {
            ((TextView) gjjVar.f25000c).setText(((Context) gjjVar.f25007j).getString(C0100R.string.jupiter_bottom_sheet_unfold_desc));
        }
        ((EduImageView) gjjVar.f25006i).m4360a();
        ((hst) gjjVar.f25001d).m10713l(17, C0100R.string.jupiter_bottom_sheet_entry_title, (View) gjjVar.f25004g);
        gjjVar.f25005h.mo10033e(gzy.f27042az, true);
    }
}
