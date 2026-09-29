package p000;

import android.content.Context;
import android.view.PointerIcon;
import android.view.View;
import androidx.datastore.preferences.protobuf.DescriptorProtos;

/* JADX INFO: renamed from: ih */
/* JADX INFO: loaded from: classes.dex */
public final class C3111ih {

    /* JADX INFO: renamed from: a */
    public static final C3111ih f44099a = new C3111ih();

    /* JADX INFO: renamed from: a */
    public final void m13906a(View view, ig7 ig7Var) {
        Context context = view.getContext();
        PointerIcon systemIcon = ig7Var instanceof C3724wj ? PointerIcon.getSystemIcon(context, ((C3724wj) ig7Var).f66898b) : PointerIcon.getSystemIcon(context, DescriptorProtos.Edition.EDITION_2023_VALUE);
        if (fa4.m11650l(view.getPointerIcon(), systemIcon)) {
            return;
        }
        view.setPointerIcon(systemIcon);
    }
}
