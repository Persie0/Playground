package com.google.android.apps.camera.p014ui.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.KeyEvent;
import androidx.preference.DialogPreference;
import p000.mro;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class MaterialKeyListenerPreference extends DialogPreference {

    /* JADX INFO: renamed from: g */
    private String f7128g;

    /* JADX INFO: renamed from: h */
    private String f7129h;

    public MaterialKeyListenerPreference(Context context) {
        super(context);
        m4418l();
    }

    /* JADX INFO: renamed from: l */
    private final void m4418l() {
        m4419k("-1");
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: G */
    protected final void mo1489G(boolean z, Object obj) {
        m4419k(z ? m1523w("-1") : (String) obj);
    }

    @Override // androidx.preference.DialogPreference, androidx.preference.Preference
    /* JADX INFO: renamed from: c */
    protected final void mo1468c() {
        ((DialogPreference) this).f1540a = "Bind Key to ".concat(String.valueOf(String.valueOf(this.f1589q)));
        ((DialogPreference) this).f1541b = "Current Key Bind: " + this.f7129h + " (Key Code: " + this.f7128g + ")\nPress key to rebind";
        ((DialogPreference) this).f1544e = "Reset";
        super.mo1468c();
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: f */
    protected final Object mo1471f(TypedArray typedArray, int i) {
        String string = typedArray.getString(i);
        return string == null ? "-1" : string;
    }

    /* JADX INFO: renamed from: k */
    public final void m4419k(String str) {
        String string;
        this.f7128g = str;
        if (str.equals("-1")) {
            this.f7129h = "None";
        } else {
            KeyEvent keyEvent = new KeyEvent(0, Integer.parseInt(str));
            int unicodeChar = keyEvent.getUnicodeChar();
            if (unicodeChar == 0 || unicodeChar == 10 || unicodeChar == 32) {
                switch (keyEvent.getKeyCode()) {
                    case 19:
                        string = "Up Arrow";
                        break;
                    case 20:
                        string = "Down Arrow";
                        break;
                    case 21:
                        string = "Left Arrow";
                        break;
                    case 22:
                        string = "Right Arrow";
                        break;
                    case 59:
                    case 60:
                        string = "Shift";
                        break;
                    case 62:
                        string = "Space";
                        break;
                    case 66:
                        string = "Enter";
                        break;
                    default:
                        string = "";
                        break;
                }
            } else {
                char c = (char) unicodeChar;
                StringBuilder sb = new StringBuilder();
                sb.append(c);
                string = sb.toString();
            }
            this.f7129h = string;
        }
        mo1479n(this.f7129h);
        m1513ad(str);
        mo1484B(mo1475j());
        mo1469d();
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: m */
    public final /* bridge */ /* synthetic */ CharSequence mo1478m() {
        String str = this.f7129h;
        return mro.m16832b(str) ? "None" : str;
    }

    public MaterialKeyListenerPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m4418l();
    }

    public MaterialKeyListenerPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m4418l();
    }

    public MaterialKeyListenerPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m4418l();
    }
}
