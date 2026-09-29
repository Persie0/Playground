package p000;

import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: loaded from: classes.dex */
public class to6 implements InputConnection {

    /* JADX INFO: renamed from: a */
    public final vi3 f62643a;

    /* JADX INFO: renamed from: b */
    public c28 f62644b;

    public to6(c28 c28Var, vi3 vi3Var) {
        this.f62643a = vi3Var;
        this.f62644b = c28Var;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        c28 c28Var = this.f62644b;
        if (c28Var != null) {
            return c28Var.beginBatchEdit();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i) {
        c28 c28Var = this.f62644b;
        if (c28Var != null) {
            return c28Var.clearMetaKeyStates(i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        c28 c28Var = this.f62644b;
        if (c28Var != null) {
            if (c28Var != null) {
                c28Var.closeConnection();
                this.f62644b = null;
            }
            this.f62643a.invoke(this);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        c28 c28Var = this.f62644b;
        if (c28Var != null) {
            return c28Var.commitCompletion(completionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        c28 c28Var = this.f62644b;
        if (c28Var != null) {
            return c28Var.commitContent(inputContentInfo, i, bundle);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        c28 c28Var = this.f62644b;
        if (c28Var != null) {
            return c28Var.commitCorrection(correctionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        c28 c28Var = this.f62644b;
        if (c28Var != null) {
            return c28Var.commitText(charSequence, i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        c28 c28Var = this.f62644b;
        if (c28Var != null) {
            return c28Var.deleteSurroundingText(i, i2);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        c28 c28Var = this.f62644b;
        if (c28Var != null) {
            return c28Var.deleteSurroundingTextInCodePoints(i, i2);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        c28 c28Var = this.f62644b;
        if (c28Var != null) {
            return c28Var.m4287b();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        c28 c28Var = this.f62644b;
        if (c28Var != null) {
            return c28Var.finishComposingText();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i) {
        c28 c28Var = this.f62644b;
        if (c28Var != null) {
            return c28Var.getCursorCapsMode(i);
        }
        return 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        c28 c28Var = this.f62644b;
        if (c28Var != null) {
            return c28Var.getExtractedText(extractedTextRequest, i);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i) {
        c28 c28Var = this.f62644b;
        if (c28Var != null) {
            return c28Var.getSelectedText(i);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i, int i2) {
        c28 c28Var = this.f62644b;
        if (c28Var != null) {
            return c28Var.getTextAfterCursor(i, i2);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i, int i2) {
        c28 c28Var = this.f62644b;
        if (c28Var != null) {
            return c28Var.getTextBeforeCursor(i, i2);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i) {
        c28 c28Var = this.f62644b;
        if (c28Var != null) {
            return c28Var.performContextMenuAction(i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i) {
        c28 c28Var = this.f62644b;
        if (c28Var != null) {
            return c28Var.performEditorAction(i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        c28 c28Var = this.f62644b;
        if (c28Var != null) {
            return c28Var.performPrivateCommand(str, bundle);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i) {
        c28 c28Var = this.f62644b;
        if (c28Var != null) {
            return c28Var.requestCursorUpdates(i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        c28 c28Var = this.f62644b;
        if (c28Var != null) {
            return c28Var.sendKeyEvent(keyEvent);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i2) {
        c28 c28Var = this.f62644b;
        if (c28Var != null) {
            return c28Var.setComposingRegion(i, i2);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        c28 c28Var = this.f62644b;
        if (c28Var != null) {
            return c28Var.setComposingText(charSequence, i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i2) {
        c28 c28Var = this.f62644b;
        if (c28Var != null) {
            return c28Var.setSelection(i, i2);
        }
        return false;
    }
}
