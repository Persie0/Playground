package mc;

import android.R;
import android.content.res.TypedArray;
import android.view.View;
import com.google.android.material.bottomsheet.DialogC2965b;

/* JADX INFO: renamed from: mc.d */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC7538d implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ DialogC2965b f41613a;

    public ViewOnClickListenerC7538d(DialogC2965b dialogC2965b) {
        this.f41613a = dialogC2965b;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        DialogC2965b dialogC2965b = this.f41613a;
        if (dialogC2965b.f14896j && dialogC2965b.isShowing()) {
            if (!dialogC2965b.f14898l) {
                TypedArray typedArrayObtainStyledAttributes = dialogC2965b.getContext().obtainStyledAttributes(new int[]{R.attr.windowCloseOnTouchOutside});
                dialogC2965b.f14897k = typedArrayObtainStyledAttributes.getBoolean(0, true);
                typedArrayObtainStyledAttributes.recycle();
                dialogC2965b.f14898l = true;
            }
            if (dialogC2965b.f14897k) {
                dialogC2965b.cancel();
            }
        }
    }
}
