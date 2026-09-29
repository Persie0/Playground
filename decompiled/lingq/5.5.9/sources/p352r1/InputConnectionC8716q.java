package p352r1;

import android.R;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import androidx.compose.p017ui.text.C0689a;
import androidx.compose.p017ui.text.input.C0706c;
import androidx.compose.p017ui.text.input.TextFieldValue;
import androidx.datastore.preferences.PreferencesProto$Value;
import dm.C5207g;
import java.util.ArrayList;
import kotlin.collections.C6752c;
import kotlin.text.C7076b;
import p231l1.C7217k;

/* JADX INFO: renamed from: r1.q */
/* JADX INFO: loaded from: classes.dex */
public final class InputConnectionC8716q implements InputConnection {

    /* JADX INFO: renamed from: a */
    public final InterfaceC8710k f46302a;

    /* JADX INFO: renamed from: b */
    public final boolean f46303b;

    /* JADX INFO: renamed from: c */
    public int f46304c;

    /* JADX INFO: renamed from: d */
    public final TextFieldValue f46305d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f46306e;

    /* JADX INFO: renamed from: f */
    public boolean f46307f;

    public InputConnectionC8716q(TextFieldValue textFieldValue, C0706c c0706c, boolean z10) {
        C5207g.m11111f(textFieldValue, "initState");
        this.f46302a = c0706c;
        this.f46303b = z10;
        this.f46305d = textFieldValue;
        this.f46306e = new ArrayList();
        this.f46307f = true;
    }

    /* JADX INFO: renamed from: a */
    public final void m16956a(InterfaceC8704e interfaceC8704e) {
        this.f46304c++;
        try {
            this.f46306e.add(interfaceC8704e);
        } finally {
            m16957b();
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m16957b() {
        int i10 = this.f46304c - 1;
        this.f46304c = i10;
        if (i10 == 0) {
            ArrayList arrayList = this.f46306e;
            if (!arrayList.isEmpty()) {
                this.f46302a.mo2607d(C6752c.m13454v0(arrayList));
                arrayList.clear();
            }
        }
        return this.f46304c > 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z10 = this.f46307f;
        if (z10) {
            this.f46304c++;
            z10 = true;
        }
        return z10;
    }

    /* JADX INFO: renamed from: c */
    public final void m16958c(int i10) {
        sendKeyEvent(new KeyEvent(0, i10));
        sendKeyEvent(new KeyEvent(1, i10));
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i10) {
        boolean z10 = this.f46307f;
        if (z10) {
            return false;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.f46306e.clear();
        this.f46304c = 0;
        this.f46307f = false;
        this.f46302a.mo2605b(this);
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z10 = this.f46307f;
        if (z10) {
            return false;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i10, Bundle bundle) {
        C5207g.m11111f(inputContentInfo, "inputContentInfo");
        boolean z10 = this.f46307f;
        if (z10) {
            return false;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z10 = this.f46307f;
        if (z10) {
            z10 = this.f46303b;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i10) {
        boolean z10 = this.f46307f;
        if (z10) {
            m16956a(new C8701b(String.valueOf(charSequence), i10));
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i10, int i11) {
        boolean z10 = this.f46307f;
        if (!z10) {
            return z10;
        }
        m16956a(new C8702c(i10, i11));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i10, int i11) {
        boolean z10 = this.f46307f;
        if (!z10) {
            return z10;
        }
        m16956a(new C8703d(i10, i11));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return m16957b();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        boolean z10 = this.f46307f;
        if (z10) {
            m16956a(new C8705f());
            z10 = true;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i10) {
        TextFieldValue textFieldValue = this.f46305d;
        return TextUtils.getCapsMode(textFieldValue.f4647a.f4523a, C7217k.m14541c(textFieldValue.f4648b), i10);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i10) {
        TextFieldValue textFieldValue = this.f46305d;
        C5207g.m11111f(textFieldValue, "<this>");
        ExtractedText extractedText = new ExtractedText();
        C0689a c0689a = textFieldValue.f4647a;
        String str = c0689a.f4523a;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j10 = textFieldValue.f4648b;
        extractedText.selectionStart = C7217k.m14541c(j10);
        extractedText.selectionEnd = C7217k.m14540b(j10);
        extractedText.flags = !C7076b.m14279Y2(c0689a.f4523a, '\n') ? 1 : 0;
        return extractedText;
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i10) {
        TextFieldValue textFieldValue = this.f46305d;
        long j10 = textFieldValue.f4648b;
        if (((int) (j10 >> 32)) == C7217k.m14539a(j10)) {
            return null;
        }
        C5207g.m11111f(textFieldValue, "<this>");
        C0689a c0689a = textFieldValue.f4647a;
        c0689a.getClass();
        long j11 = textFieldValue.f4648b;
        return c0689a.subSequence(C7217k.m14541c(j11), C7217k.m14540b(j11)).f4523a;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i10, int i11) {
        TextFieldValue textFieldValue = this.f46305d;
        C5207g.m11111f(textFieldValue, "<this>");
        long j10 = textFieldValue.f4648b;
        int iM14540b = C7217k.m14540b(j10);
        int iM14540b2 = C7217k.m14540b(j10) + i10;
        C0689a c0689a = textFieldValue.f4647a;
        return c0689a.subSequence(iM14540b, Math.min(iM14540b2, c0689a.f4523a.length())).f4523a;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i10, int i11) {
        TextFieldValue textFieldValue = this.f46305d;
        C5207g.m11111f(textFieldValue, "<this>");
        long j10 = textFieldValue.f4648b;
        return textFieldValue.f4647a.subSequence(Math.max(0, C7217k.m14541c(j10) - i10), C7217k.m14541c(j10)).f4523a;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i10) {
        boolean z10 = this.f46307f;
        if (z10) {
            z10 = false;
            switch (i10) {
                case R.id.selectAll:
                    m16956a(new C8719t(0, this.f46305d.f4647a.f4523a.length()));
                    break;
                case R.id.cut:
                    m16958c(277);
                    break;
                case R.id.copy:
                    m16958c(278);
                    break;
                case R.id.paste:
                    m16958c(279);
                    break;
            }
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i10) {
        boolean z10 = this.f46307f;
        if (z10) {
            if (i10 != 0) {
                switch (i10) {
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                        break;
                    default:
                        Log.w("RecordingIC", "IME sends unsupported Editor Action: " + i10);
                        break;
                }
            }
            this.f46302a.mo2606c();
            z10 = true;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z10 = this.f46307f;
        if (z10) {
            return true;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z10) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i10) {
        boolean z10 = this.f46307f;
        if (z10) {
            Log.w("RecordingIC", "requestCursorUpdates is not supported");
            z10 = false;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        C5207g.m11111f(keyEvent, "event");
        boolean z10 = this.f46307f;
        if (!z10) {
            return z10;
        }
        this.f46302a.mo2604a(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i10, int i11) {
        boolean z10 = this.f46307f;
        if (z10) {
            m16956a(new C8717r(i10, i11));
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i10) {
        boolean z10 = this.f46307f;
        if (z10) {
            m16956a(new C8718s(String.valueOf(charSequence), i10));
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i10, int i11) {
        boolean z10 = this.f46307f;
        if (!z10) {
            return z10;
        }
        m16956a(new C8719t(i10, i11));
        return true;
    }
}
