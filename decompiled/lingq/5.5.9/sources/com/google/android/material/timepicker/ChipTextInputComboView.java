package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.chip.Chip;
import com.google.android.material.textfield.TextInputLayout;
import com.linguist.R;
import java.util.WeakHashMap;
import p471x2.C10029b0;
import p471x2.C10049l0;
import p507yc.C10343j;
import p507yc.RunnableC10346m;

/* JADX INFO: loaded from: classes.dex */
class ChipTextInputComboView extends FrameLayout implements Checkable {

    /* JADX INFO: renamed from: a */
    public final Chip f15818a;

    /* JADX INFO: renamed from: b */
    public final EditText f15819b;

    /* JADX INFO: renamed from: com.google.android.material.timepicker.ChipTextInputComboView$a */
    public class C3094a extends C10343j {
        public C3094a() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            boolean zIsEmpty = TextUtils.isEmpty(editable);
            ChipTextInputComboView chipTextInputComboView = ChipTextInputComboView.this;
            if (zIsEmpty) {
                chipTextInputComboView.f15818a.setText(ChipTextInputComboView.m8926a(chipTextInputComboView, "00"));
                return;
            }
            String strM8926a = ChipTextInputComboView.m8926a(chipTextInputComboView, editable);
            Chip chip = chipTextInputComboView.f15818a;
            if (TextUtils.isEmpty(strM8926a)) {
                strM8926a = ChipTextInputComboView.m8926a(chipTextInputComboView, "00");
            }
            chip.setText(strM8926a);
        }
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        Chip chip = (Chip) layoutInflaterFrom.inflate(R.layout.material_time_chip, (ViewGroup) this, false);
        this.f15818a = chip;
        chip.setAccessibilityClassName("android.view.View");
        TextInputLayout textInputLayout = (TextInputLayout) layoutInflaterFrom.inflate(R.layout.material_time_input, (ViewGroup) this, false);
        EditText editText = textInputLayout.getEditText();
        this.f15819b = editText;
        editText.setVisibility(4);
        editText.addTextChangedListener(new C3094a());
        editText.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
        addView(chip);
        addView(textInputLayout);
        TextView textView = (TextView) findViewById(R.id.material_label);
        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
        editText.setId(C10029b0.e.m18683a());
        C10029b0.e.m18690h(textView, editText.getId());
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
    }

    /* JADX INFO: renamed from: a */
    public static String m8926a(ChipTextInputComboView chipTextInputComboView, CharSequence charSequence) {
        try {
            return String.format(chipTextInputComboView.getResources().getConfiguration().locale, "%02d", Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f15818a.isChecked();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f15819b.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z10) {
        Chip chip = this.f15818a;
        chip.setChecked(z10);
        int i10 = z10 ? 0 : 4;
        EditText editText = this.f15819b;
        editText.setVisibility(i10);
        chip.setVisibility(z10 ? 8 : 0);
        if (isChecked()) {
            editText.requestFocus();
            editText.post(new RunnableC10346m(editText));
        }
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f15818a.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public final void setTag(int i10, Object obj) {
        this.f15818a.setTag(i10, obj);
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        this.f15818a.toggle();
    }
}
