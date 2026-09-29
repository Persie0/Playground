package p000;

import android.content.DialogInterface;

/* JADX INFO: loaded from: classes3.dex */
public final class ow7 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: b */
    public static final ow7 f55076b = new ow7(0);

    /* JADX INFO: renamed from: c */
    public static final ow7 f55077c = new ow7(1);

    /* JADX INFO: renamed from: d */
    public static final ow7 f55078d = new ow7(2);

    /* JADX INFO: renamed from: e */
    public static final ow7 f55079e = new ow7(3);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f55080a;

    public /* synthetic */ ow7(int i) {
        this.f55080a = i;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f55080a) {
            case 0:
                dialogInterface.dismiss();
                break;
            case 1:
                dialogInterface.dismiss();
                break;
            case 2:
                dialogInterface.dismiss();
                break;
            default:
                dialogInterface.dismiss();
                break;
        }
    }
}
