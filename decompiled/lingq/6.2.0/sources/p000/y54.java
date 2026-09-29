package p000;

import android.content.ClipData;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import androidx.appcompat.widget.AppCompatEditText;

/* JADX INFO: loaded from: classes2.dex */
public final class y54 extends InputConnectionWrapper {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C3440oy f69306a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y54(InputConnection inputConnection, C3440oy c3440oy) {
        super(inputConnection, false);
        this.f69306a = c3440oy;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        Bundle bundle2;
        yk1 webVar;
        vj6 vj6Var = inputContentInfo == null ? null : new vj6(new hi8(inputContentInfo, 20), 21);
        AppCompatEditText appCompatEditText = (AppCompatEditText) this.f69306a.f55160b;
        if ((i & 1) != 0) {
            try {
                ((InputContentInfo) ((hi8) vj6Var.f65506b).f42410b).requestPermission();
                InputContentInfo inputContentInfo2 = (InputContentInfo) ((hi8) vj6Var.f65506b).f42410b;
                bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle2.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo2);
            } catch (Exception e) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e);
            }
        } else {
            bundle2 = bundle;
        }
        InputContentInfo inputContentInfo3 = (InputContentInfo) ((hi8) vj6Var.f65506b).f42410b;
        ClipData clipData = new ClipData(inputContentInfo3.getDescription(), new ClipData.Item(inputContentInfo3.getContentUri()));
        if (Build.VERSION.SDK_INT >= 31) {
            webVar = new web(clipData, 2);
        } else {
            zk1 zk1Var = new zk1();
            zk1Var.f71674b = clipData;
            zk1Var.f71675c = 2;
            webVar = zk1Var;
        }
        webVar.mo23877f(inputContentInfo3.getLinkUri());
        webVar.setExtras(bundle2);
        if (dta.m10637h(appCompatEditText, webVar.build()) == null) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
