package com.google.android.apps.camera.p014ui.preference;

import android.R;
import android.app.AlertDialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.preference.DialogPreference;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.apps.camera.p014ui.preference.KeyListenerPreference;
import p000.idz;
import p000.mro;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class KeyListenerPreference extends DialogPreference {

    /* JADX INFO: renamed from: a */
    public String f7105a;

    /* JADX INFO: renamed from: b */
    public String f7106b;

    public KeyListenerPreference(Context context) {
        super(context);
        m4412c();
    }

    /* JADX INFO: renamed from: a */
    public static String m4411a(KeyEvent keyEvent) {
        int unicodeChar = keyEvent.getUnicodeChar();
        if (unicodeChar != 0 && unicodeChar != 10 && unicodeChar != 32) {
            char c = (char) unicodeChar;
            StringBuilder sb = new StringBuilder();
            sb.append(c);
            return sb.toString();
        }
        switch (keyEvent.getKeyCode()) {
            case 19:
                return "Up Arrow";
            case 20:
                return "Down Arrow";
            case 21:
                return "Left Arrow";
            case 22:
                return "Right Arrow";
            case 59:
            case 60:
                return "Shift";
            case 62:
                return "Space";
            case 66:
                return "Enter";
            default:
                return "";
        }
    }

    /* JADX INFO: renamed from: c */
    private final void m4412c() {
        m4413b("-1");
    }

    /* JADX INFO: renamed from: b */
    public final void m4413b(String str) {
        this.f7105a = str;
        if (str.equals("-1")) {
            this.f7106b = "None";
        } else {
            this.f7106b = m4411a(new KeyEvent(0, Integer.parseInt(str)));
        }
        setSummary(this.f7106b);
        persistString(str);
        notifyDependencyChange(shouldDisableDependents());
        notifyChanged();
    }

    @Override // android.preference.Preference
    public final /* bridge */ /* synthetic */ CharSequence getSummary() {
        String str = this.f7106b;
        return mro.m16832b(str) ? "None" : str;
    }

    @Override // android.preference.DialogPreference, android.preference.Preference
    protected final void onClick() {
        setDialogTitle("Bind Key to ".concat(String.valueOf(String.valueOf(getTitle()))));
        setDialogMessage("Current Key Bind: " + this.f7106b + " (Key Code: " + this.f7105a + ")\nPress key to rebind");
        setNegativeButtonText("Reset");
        super.onClick();
        AlertDialog alertDialog = (AlertDialog) getDialog();
        ViewGroup viewGroup = (ViewGroup) alertDialog.findViewById(R.id.content);
        final TextView textView = (TextView) alertDialog.findViewById(R.id.message);
        final Button button = alertDialog.getButton(-1);
        final Button button2 = alertDialog.getButton(-2);
        viewGroup.setDescendantFocusability(393216);
        textView.setTextColor(-16777216);
        textView.setTextSize(18.0f);
        button.setEnabled(false);
        if (this.f7105a.equals("-1")) {
            textView.setText("Current Key Bind: None\nPress key to bind");
            button2.setVisibility(4);
        }
        alertDialog.getButton(-2).setOnClickListener(new View.OnClickListener() { // from class: idy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                KeyListenerPreference keyListenerPreference = this.f30536a;
                TextView textView2 = textView;
                Button button3 = button2;
                Button button4 = button;
                keyListenerPreference.m4413b("-1");
                textView2.setText("Current Key Bind: None\nPress key to bind");
                textView2.sendAccessibilityEvent(4);
                button3.setVisibility(4);
                button4.setEnabled(true);
            }
        });
        alertDialog.setOnKeyListener(new idz(this, textView, button, button2));
    }

    @Override // android.preference.DialogPreference
    protected final void onDialogClosed(boolean z) {
        super.onDialogClosed(z);
        if (z) {
            String str = this.f7105a;
            if (callChangeListener(str)) {
                m4413b(str);
            }
            setSummary(this.f7106b);
        }
    }

    @Override // android.preference.Preference
    protected final Object onGetDefaultValue(TypedArray typedArray, int i) {
        String string = typedArray.getString(i);
        return string == null ? "-1" : string;
    }

    @Override // android.preference.Preference
    protected final void onSetInitialValue(boolean z, Object obj) {
        m4413b(z ? getPersistedString("-1") : (String) obj);
    }

    public KeyListenerPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m4412c();
    }

    public KeyListenerPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m4412c();
    }

    public KeyListenerPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m4412c();
    }
}
