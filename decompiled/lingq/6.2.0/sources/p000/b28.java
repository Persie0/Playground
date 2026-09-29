package p000;

import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import androidx.compose.p002ui.text.input.C0435a;
import androidx.compose.p002ui.text.input.C0439e;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class b28 implements InputConnection {

    /* JADX INFO: renamed from: a */
    public final gw9 f7796a;

    /* JADX INFO: renamed from: b */
    public final boolean f7797b;

    /* JADX INFO: renamed from: c */
    public int f7798c;

    /* JADX INFO: renamed from: d */
    public vv9 f7799d;

    /* JADX INFO: renamed from: e */
    public int f7800e;

    /* JADX INFO: renamed from: f */
    public boolean f7801f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f7802g = new ArrayList();

    /* JADX INFO: renamed from: h */
    public boolean f7803h = true;

    public b28(vv9 vv9Var, gw9 gw9Var, boolean z) {
        this.f7796a = gw9Var;
        this.f7797b = z;
        this.f7799d = vv9Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m3193a(uo2 uo2Var) {
        this.f7798c++;
        try {
            this.f7802g.add(uo2Var);
        } finally {
            m3194b();
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m3194b() {
        int i = this.f7798c - 1;
        this.f7798c = i;
        if (i == 0) {
            ArrayList arrayList = this.f7802g;
            if (!arrayList.isEmpty()) {
                ((C0439e) this.f7796a.f41432b).f5094e.invoke(new ArrayList(arrayList));
                arrayList.clear();
            }
        }
        return this.f7798c > 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z = this.f7803h;
        if (!z) {
            return z;
        }
        this.f7798c++;
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final void m3195c(int i) {
        sendKeyEvent(new KeyEvent(0, i));
        sendKeyEvent(new KeyEvent(1, i));
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i) {
        boolean z = this.f7803h;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.f7802g.clear();
        this.f7798c = 0;
        this.f7803h = false;
        ArrayList arrayList = ((C0439e) this.f7796a.f41432b).f5098i;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (fa4.m11650l(((WeakReference) arrayList.get(i)).get(), this)) {
                arrayList.remove(i);
                return;
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z = this.f7803h;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        boolean z = this.f7803h;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z = this.f7803h;
        return z ? this.f7797b : z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        boolean z = this.f7803h;
        if (z) {
            m3193a(new hb1(String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        boolean z = this.f7803h;
        if (!z) {
            return z;
        }
        m3193a(new ya2(i, i2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        boolean z = this.f7803h;
        if (!z) {
            return z;
        }
        m3193a(new za2(i, i2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return m3194b();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        boolean z = this.f7803h;
        if (!z) {
            return z;
        }
        m3193a(new k43());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i) {
        vv9 vv9Var = this.f7799d;
        return TextUtils.getCapsMode(vv9Var.f65990a.f54604b, cx9.m9924f(vv9Var.f65991b), i);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        boolean z = (i & 1) != 0;
        this.f7801f = z;
        if (z) {
            this.f7800e = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return ci8.m4713Z(this.f7799d);
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i) {
        if (cx9.m9921c(this.f7799d.f65991b)) {
            return null;
        }
        return AbstractC3489q9.m19784n(this.f7799d).f54604b;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i, int i2) {
        return AbstractC3489q9.m19785o(this.f7799d, i).f54604b;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i, int i2) {
        return AbstractC3489q9.m19786p(this.f7799d, i).f54604b;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i) {
        boolean z = this.f7803h;
        if (z) {
            z = false;
            switch (i) {
                case R.id.selectAll:
                    m3193a(new a09(0, this.f7799d.f65990a.f54604b.length()));
                    break;
                case R.id.cut:
                    m3195c(277);
                    return false;
                case R.id.copy:
                    m3195c(278);
                    return false;
                case R.id.paste:
                    m3195c(279);
                    return false;
                default:
                    return false;
            }
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i) {
        int i2;
        boolean z = this.f7803h;
        if (z) {
            z = true;
            if (i != 0) {
                switch (i) {
                    case 2:
                        i2 = 2;
                        break;
                    case 3:
                        i2 = 3;
                        break;
                    case 4:
                        i2 = 4;
                        break;
                    case 5:
                        i2 = 6;
                        break;
                    case 6:
                        i2 = 7;
                        break;
                    case 7:
                        i2 = 5;
                        break;
                    default:
                        Log.w("RecordingIC", "IME sends unsupported Editor Action: " + i);
                        i2 = 1;
                        break;
                }
            } else {
                i2 = 1;
            }
            ((C0439e) this.f7796a.f41432b).f5095f.invoke(new v04(i2));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z = this.f7803h;
        if (z) {
            return true;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z) {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0065 A[Catch: all -> 0x006f, TryCatch #0 {all -> 0x006f, blocks: (B:44:0x005b, B:46:0x0065, B:48:0x006b, B:51:0x0071), top: B:57:0x005b }] */
    /* JADX WARN: Code duplicated, block: B:48:0x006b A[Catch: all -> 0x006f, TryCatch #0 {all -> 0x006f, blocks: (B:44:0x005b, B:46:0x0065, B:48:0x006b, B:51:0x0071), top: B:57:0x005b }] */
    /* JADX WARN: Code duplicated, block: B:57:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        C0435a c0435a;
        boolean z4 = this.f7803h;
        if (!z4) {
            return z4;
        }
        boolean z5 = false;
        boolean z6 = (i & 1) != 0;
        boolean z7 = (i & 2) != 0;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            z2 = (i & 16) != 0;
            z3 = (i & 8) != 0;
            boolean z8 = (i & 4) != 0;
            if (i2 >= 34 && (i & 32) != 0) {
                z5 = true;
            }
            if (z2 || z3 || z8 || z5) {
                z = z5;
                z5 = z8;
            } else {
                if (i2 >= 34) {
                    z = true;
                    z5 = true;
                } else {
                    z = z5;
                    z5 = true;
                }
                z2 = z5;
            }
            c0435a = ((C0439e) this.f7796a.f41432b).f5101l;
            synchronized (c0435a.f5069c) {
                try {
                    c0435a.f5072f = z2;
                    c0435a.f5073g = z3;
                    c0435a.f5074h = z5;
                    c0435a.f5075i = z;
                    if (z6) {
                        c0435a.f5071e = true;
                        if (c0435a.f5076j != null) {
                            c0435a.m1882a();
                        }
                    }
                    c0435a.f5070d = z7;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return true;
        }
        z = false;
        z2 = true;
        z3 = z2;
        c0435a = ((C0439e) this.f7796a.f41432b).f5101l;
        synchronized (c0435a.f5069c) {
            c0435a.f5072f = z2;
            c0435a.f5073g = z3;
            c0435a.f5074h = z5;
            c0435a.f5075i = z;
            if (z6) {
                c0435a.f5071e = true;
                if (c0435a.f5076j != null) {
                    c0435a.m1882a();
                }
            }
            c0435a.f5070d = z7;
            return true;
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z = this.f7803h;
        if (!z) {
            return z;
        }
        ((BaseInputConnection) ((C0439e) this.f7796a.f41432b).f5099j.getValue()).sendKeyEvent(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i2) {
        boolean z = this.f7803h;
        if (z) {
            m3193a(new pz8(i, i2));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        boolean z = this.f7803h;
        if (z) {
            m3193a(new qz8(String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i2) {
        boolean z = this.f7803h;
        if (!z) {
            return z;
        }
        m3193a(new a09(i, i2));
        return true;
    }
}
