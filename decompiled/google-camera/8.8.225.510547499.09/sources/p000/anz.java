package p000;

import android.R;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.preference.DialogPreference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class anz extends DialogInterfaceOnCancelListenerC0067bm implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ad */
    private DialogPreference f1852ad;

    /* JADX INFO: renamed from: ae */
    private CharSequence f1853ae;

    /* JADX INFO: renamed from: af */
    private CharSequence f1854af;

    /* JADX INFO: renamed from: ag */
    private CharSequence f1855ag;

    /* JADX INFO: renamed from: ah */
    public int f1856ah;

    /* JADX INFO: renamed from: ai */
    private CharSequence f1857ai;

    /* JADX INFO: renamed from: aj */
    private int f1858aj;

    /* JADX INFO: renamed from: ak */
    private BitmapDrawable f1859ak;

    /* JADX INFO: renamed from: A */
    public abstract void mo1725A(boolean z);

    /* JADX INFO: renamed from: B */
    protected boolean mo1726B() {
        return false;
    }

    /* JADX INFO: renamed from: D */
    public final DialogPreference m1738D() {
        if (this.f1852ad == null) {
            this.f1852ad = (DialogPreference) ((ang) getTargetFragment()).mo1723a(requireArguments().getString("key"));
        }
        return this.f1852ad;
    }

    /* JADX INFO: renamed from: aS */
    protected void mo1731aS(C0154ef c0154ef) {
    }

    @Override // p000.DialogInterfaceOnCancelListenerC0067bm
    /* JADX INFO: renamed from: d */
    public final Dialog mo1739d() {
        this.f1856ah = -2;
        C0154ef c0154ef = new C0154ef(requireContext());
        c0154ef.m7263i(this.f1853ae);
        c0154ef.m7258d(this.f1859ak);
        c0154ef.m7262h(this.f1854af, this);
        c0154ef.m7260f(this.f1855ag, this);
        requireContext();
        int i = this.f1858aj;
        View viewInflate = null;
        if (i != 0) {
            LayoutInflater layoutInflaterM3115j = this.f4592T;
            if (layoutInflaterM3115j == null) {
                layoutInflaterM3115j = m3115j(null);
            }
            viewInflate = layoutInflaterM3115j.inflate(i, (ViewGroup) null);
        }
        if (viewInflate != null) {
            mo1728z(viewInflate);
            c0154ef.m7264j(viewInflate);
        } else {
            c0154ef.m7259e(this.f1857ai);
        }
        mo1731aS(c0154ef);
        DialogInterfaceC0155eg dialogInterfaceC0155egMo7256b = c0154ef.mo7256b();
        if (mo1726B()) {
            any.m1737a(dialogInterfaceC0155egMo7256b.getWindow());
        }
        return dialogInterfaceC0155egMo7256b;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f1856ah = i;
    }

    @Override // p000.DialogInterfaceOnCancelListenerC0067bm, p000.ComponentCallbacksC0077bw
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        akn targetFragment = getTargetFragment();
        if (!(targetFragment instanceof ang)) {
            throw new IllegalStateException("Target fragment must implement TargetFragment interface");
        }
        ang angVar = (ang) targetFragment;
        String string = requireArguments().getString("key");
        if (bundle != null) {
            this.f1853ae = bundle.getCharSequence("PreferenceDialogFragment.title");
            this.f1854af = bundle.getCharSequence("PreferenceDialogFragment.positiveText");
            this.f1855ag = bundle.getCharSequence("PreferenceDialogFragment.negativeText");
            this.f1857ai = bundle.getCharSequence("PreferenceDialogFragment.message");
            this.f1858aj = bundle.getInt("PreferenceDialogFragment.layout", 0);
            Bitmap bitmap = (Bitmap) bundle.getParcelable("PreferenceDialogFragment.icon");
            if (bitmap != null) {
                this.f1859ak = new BitmapDrawable(getResources(), bitmap);
                return;
            }
            return;
        }
        DialogPreference dialogPreference = (DialogPreference) angVar.mo1723a(string);
        this.f1852ad = dialogPreference;
        this.f1853ae = dialogPreference.f1540a;
        this.f1854af = dialogPreference.f1543d;
        this.f1855ag = dialogPreference.f1544e;
        this.f1857ai = dialogPreference.f1541b;
        this.f1858aj = dialogPreference.f1545f;
        Drawable drawable = dialogPreference.f1542c;
        if (drawable == null || (drawable instanceof BitmapDrawable)) {
            this.f1859ak = (BitmapDrawable) drawable;
            return;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        this.f1859ak = new BitmapDrawable(getResources(), bitmapCreateBitmap);
    }

    @Override // p000.DialogInterfaceOnCancelListenerC0067bm, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        mo1725A(this.f1856ah == -1);
    }

    @Override // p000.DialogInterfaceOnCancelListenerC0067bm, p000.ComponentCallbacksC0077bw
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("PreferenceDialogFragment.title", this.f1853ae);
        bundle.putCharSequence("PreferenceDialogFragment.positiveText", this.f1854af);
        bundle.putCharSequence("PreferenceDialogFragment.negativeText", this.f1855ag);
        bundle.putCharSequence("PreferenceDialogFragment.message", this.f1857ai);
        bundle.putInt("PreferenceDialogFragment.layout", this.f1858aj);
        BitmapDrawable bitmapDrawable = this.f1859ak;
        if (bitmapDrawable != null) {
            bundle.putParcelable("PreferenceDialogFragment.icon", bitmapDrawable.getBitmap());
        }
    }

    /* JADX INFO: renamed from: z */
    protected void mo1728z(View view) {
        int i;
        View viewFindViewById = view.findViewById(R.id.message);
        if (viewFindViewById != null) {
            CharSequence charSequence = this.f1857ai;
            if (TextUtils.isEmpty(charSequence)) {
                i = 8;
            } else {
                i = 0;
                if (viewFindViewById instanceof TextView) {
                    ((TextView) viewFindViewById).setText(charSequence);
                }
            }
            if (viewFindViewById.getVisibility() != i) {
                viewFindViewById.setVisibility(i);
            }
        }
    }
}
