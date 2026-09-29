package p004a3;

import android.content.ClipData;
import android.content.ClipDescription;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import p402u0.C9371n;
import p471x2.C10029b0;
import p471x2.C10030c;

/* JADX INFO: renamed from: a3.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0013c extends InputConnectionWrapper {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC0014d f7a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0013c(InputConnection inputConnection, C9371n c9371n) {
        super(inputConnection, false);
        this.f7a = c9371n;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i10, Bundle bundle) {
        Bundle bundle2;
        C0015e c0015e = inputContentInfo == null ? null : new C0015e(new C0015e.a(inputContentInfo));
        View view = (View) ((C9371n) this.f7a).f48145b;
        boolean z10 = false;
        if ((i10 & 1) != 0) {
            try {
                ((C0015e.a) c0015e.f8a).m54b();
                InputContentInfo inputContentInfo2 = (InputContentInfo) ((C0015e.a) c0015e.f8a).m53a();
                bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle2.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo2);
            } catch (Exception e10) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e10);
            }
        } else {
            bundle2 = bundle;
        }
        ClipDescription description = ((C0015e.a) c0015e.f8a).f9a.getDescription();
        C0015e.a aVar = (C0015e.a) c0015e.f8a;
        ClipData clipData = new ClipData(description, new ClipData.Item(aVar.f9a.getContentUri()));
        C10030c.b aVar2 = Build.VERSION.SDK_INT >= 31 ? new C10030c.a(clipData, 2) : new C10030c.c(clipData, 2);
        aVar2.mo18781c(aVar.f9a.getLinkUri());
        aVar2.mo18780b(bundle2);
        if (C10029b0.m18654j(view, aVar2.mo18779a()) == null) {
            z10 = true;
        }
        if (z10) {
            return true;
        }
        return super.commitContent(inputContentInfo, i10, bundle);
    }
}
