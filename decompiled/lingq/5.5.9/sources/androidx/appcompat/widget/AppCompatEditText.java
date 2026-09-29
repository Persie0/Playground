package androidx.appcompat.widget;

import ae.C0062b;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import com.linguist.R;
import p004a3.C0012b;
import p004a3.C0013c;
import p024b3.C1304k;
import p024b3.C1305l;
import p402u0.C9371n;
import p471x2.C10029b0;
import p471x2.C10030c;
import p471x2.InterfaceC10064t;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatEditText extends EditText implements InterfaceC10064t {

    /* JADX INFO: renamed from: a */
    public final C0304d f890a;

    /* JADX INFO: renamed from: b */
    public final C0350x f891b;

    /* JADX INFO: renamed from: c */
    public final C0348w f892c;

    /* JADX INFO: renamed from: d */
    public final C1305l f893d;

    /* JADX INFO: renamed from: e */
    public final C0322j f894e;

    /* JADX INFO: renamed from: f */
    public C0250a f895f;

    /* JADX INFO: renamed from: androidx.appcompat.widget.AppCompatEditText$a */
    public class C0250a {
        public C0250a() {
        }
    }

    public AppCompatEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatEditText(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, R.attr.editTextStyle);
        C0353y0.m1309a(context);
        C0349w0.m1279a(getContext(), this);
        C0304d c0304d = new C0304d(this);
        this.f890a = c0304d;
        c0304d.m1128d(attributeSet, R.attr.editTextStyle);
        C0350x c0350x = new C0350x(this);
        this.f891b = c0350x;
        c0350x.m1288f(attributeSet, R.attr.editTextStyle);
        c0350x.m1285b();
        this.f892c = new C0348w(this);
        this.f893d = new C1305l();
        C0322j c0322j = new C0322j(this);
        this.f894e = c0322j;
        c0322j.m1219g(attributeSet, R.attr.editTextStyle);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean zIsFocusable = super.isFocusable();
            boolean zIsClickable = super.isClickable();
            boolean zIsLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener keyListenerM1218f = c0322j.m1218f(keyListener);
            if (keyListenerM1218f == keyListener) {
                return;
            }
            super.setKeyListener(keyListenerM1218f);
            super.setRawInputType(inputType);
            super.setFocusable(zIsFocusable);
            super.setClickable(zIsClickable);
            super.setLongClickable(zIsLongClickable);
        }
    }

    private C0250a getSuperCaller() {
        if (this.f895f == null) {
            this.f895f = new C0250a();
        }
        return this.f895f;
    }

    @Override // p471x2.InterfaceC10064t
    /* JADX INFO: renamed from: a */
    public final C10030c mo990a(C10030c c10030c) {
        return this.f893d.mo4864a(this, c10030c);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0304d c0304d = this.f890a;
        if (c0304d != null) {
            c0304d.m1125a();
        }
        C0350x c0350x = this.f891b;
        if (c0350x != null) {
            c0350x.m1285b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return C1304k.m4831f(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0304d c0304d = this.f890a;
        if (c0304d != null) {
            return c0304d.m1126b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0304d c0304d = this.f890a;
        if (c0304d != null) {
            return c0304d.m1127c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f891b.m1286d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f891b.m1287e();
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C0348w c0348w;
        if (Build.VERSION.SDK_INT >= 28 || (c0348w = this.f892c) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = c0348w.f1365b;
        return textClassifier == null ? C0348w.a.m1278a(c0348w.f1364a) : textClassifier;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] strArrM18651g;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f891b.getClass();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 30 && inputConnectionOnCreateInputConnection != null) {
            C0012b.m51a(editorInfo, getText());
        }
        C0062b.m274H1(this, editorInfo, inputConnectionOnCreateInputConnection);
        if (inputConnectionOnCreateInputConnection != null && i10 <= 30 && (strArrM18651g = C10029b0.m18651g(this)) != null) {
            editorInfo.contentMimeTypes = strArrM18651g;
            inputConnectionOnCreateInputConnection = new C0013c(inputConnectionOnCreateInputConnection, new C9371n(1, this));
        }
        return this.f894e.m1220h(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        boolean zM1265a = false;
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null) {
            if (C10029b0.m18651g(this) != null) {
                Context context = getContext();
                while (true) {
                    if (!(context instanceof ContextWrapper)) {
                        activity = null;
                        break;
                    }
                    if (context instanceof Activity) {
                        activity = (Activity) context;
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                }
                if (activity == null) {
                    Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + this);
                } else if (dragEvent.getAction() != 1) {
                    if (dragEvent.getAction() == 3) {
                        zM1265a = C0340s.m1265a(dragEvent, this, activity);
                    }
                }
            }
        }
        if (zM1265a) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i10) {
        int i11 = Build.VERSION.SDK_INT;
        int i12 = 0;
        if (i11 < 31 && C10029b0.m18651g(this) != null && (i10 == 16908322 || i10 == 16908337)) {
            ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
            ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
            if (primaryClip != null && primaryClip.getItemCount() > 0) {
                C10030c.b aVar = i11 >= 31 ? new C10030c.a(primaryClip, 1) : new C10030c.c(primaryClip, 1);
                if (i10 != 16908322) {
                    i12 = 1;
                }
                aVar.mo18782d(i12);
                C10029b0.m18654j(this, aVar.mo18779a());
            }
            i12 = 1;
        }
        if (i12 != 0) {
            return true;
        }
        return super.onTextContextMenuItem(i10);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0304d c0304d = this.f890a;
        if (c0304d != null) {
            c0304d.m1129e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C0304d c0304d = this.f890a;
        if (c0304d != null) {
            c0304d.m1130f(i10);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0350x c0350x = this.f891b;
        if (c0350x != null) {
            c0350x.m1285b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0350x c0350x = this.f891b;
        if (c0350x != null) {
            c0350x.m1285b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C1304k.m4832g(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        this.f894e.m1223k(z10);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f894e.m1218f(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0304d c0304d = this.f890a;
        if (c0304d != null) {
            c0304d.m1132h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0304d c0304d = this.f890a;
        if (c0304d != null) {
            c0304d.m1133i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0350x c0350x = this.f891b;
        c0350x.m1293k(colorStateList);
        c0350x.m1285b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0350x c0350x = this.f891b;
        c0350x.m1294l(mode);
        c0350x.m1285b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        C0350x c0350x = this.f891b;
        if (c0350x != null) {
            c0350x.m1289g(i10, context);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C0348w c0348w;
        if (Build.VERSION.SDK_INT < 28 && (c0348w = this.f892c) != null) {
            c0348w.f1365b = textClassifier;
            return;
        }
        super.setTextClassifier(textClassifier);
    }
}
