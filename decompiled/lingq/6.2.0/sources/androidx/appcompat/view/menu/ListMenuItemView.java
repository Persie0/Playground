package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.R$attr;
import androidx.appcompat.R$id;
import androidx.appcompat.R$layout;
import androidx.appcompat.R$string;
import androidx.appcompat.R$styleable;
import p000.hw5;
import p000.hx5;
import p000.mw5;
import p000.sq5;

/* JADX INFO: loaded from: classes2.dex */
public class ListMenuItemView extends LinearLayout implements hx5, AbsListView.SelectionBoundsAdjuster {

    /* JADX INFO: renamed from: H */
    public boolean f1030H;

    /* JADX INFO: renamed from: I */
    public final Drawable f1031I;

    /* JADX INFO: renamed from: J */
    public final boolean f1032J;

    /* JADX INFO: renamed from: K */
    public LayoutInflater f1033K;

    /* JADX INFO: renamed from: L */
    public boolean f1034L;

    /* JADX INFO: renamed from: a */
    public mw5 f1035a;

    /* JADX INFO: renamed from: b */
    public ImageView f1036b;

    /* JADX INFO: renamed from: c */
    public RadioButton f1037c;

    /* JADX INFO: renamed from: d */
    public TextView f1038d;

    /* JADX INFO: renamed from: e */
    public CheckBox f1039e;

    /* JADX INFO: renamed from: f */
    public TextView f1040f;

    /* JADX INFO: renamed from: g */
    public ImageView f1041g;

    /* JADX INFO: renamed from: h */
    public ImageView f1042h;

    /* JADX INFO: renamed from: i */
    public LinearLayout f1043i;

    /* JADX INFO: renamed from: j */
    public final Drawable f1044j;

    /* JADX INFO: renamed from: k */
    public final int f1045k;

    /* JADX INFO: renamed from: l */
    public final Context f1046l;

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        sq5 sq5VarM21551w = sq5.m21551w(i, 0, getContext(), attributeSet, R$styleable.MenuView);
        this.f1044j = sq5VarM21551w.m21568j(R$styleable.MenuView_android_itemBackground);
        int i2 = R$styleable.MenuView_android_itemTextAppearance;
        TypedArray typedArray = (TypedArray) sq5VarM21551w.f61249c;
        this.f1045k = typedArray.getResourceId(i2, -1);
        this.f1030H = typedArray.getBoolean(R$styleable.MenuView_preserveIconSpacing, false);
        this.f1046l = context;
        this.f1031I = sq5VarM21551w.m21568j(R$styleable.MenuView_subMenuArrow);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, R$attr.dropDownListViewStyle, 0);
        this.f1032J = typedArrayObtainStyledAttributes.hasValue(0);
        sq5VarM21551w.m21582y();
        typedArrayObtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f1033K == null) {
            this.f1033K = LayoutInflater.from(getContext());
        }
        return this.f1033K;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.f1041g;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f1042h;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f1042h.getLayoutParams();
        rect.top = this.f1042h.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0035  */
    /* JADX WARN: Code duplicated, block: B:25:0x0053  */
    @Override // p000.hx5
    /* JADX INFO: renamed from: c */
    public final void mo643c(mw5 mw5Var) {
        boolean z;
        int i;
        String string;
        this.f1035a = mw5Var;
        boolean zIsVisible = mw5Var.isVisible();
        hw5 hw5Var = mw5Var.f51955n;
        setVisibility(zIsVisible ? 0 : 8);
        setTitle(mw5Var.f51946e);
        setCheckable(mw5Var.isCheckable());
        if (hw5Var.mo13532o()) {
            if ((hw5Var.mo13531n() ? mw5Var.f51951j : mw5Var.f51949h) != 0) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        hw5Var.mo13531n();
        if (z) {
            mw5 mw5Var2 = this.f1035a;
            hw5 hw5Var2 = mw5Var2.f51955n;
            if (hw5Var2.mo13532o()) {
                i = (hw5Var2.mo13531n() ? mw5Var2.f51951j : mw5Var2.f51949h) == 0 ? 8 : 0;
            }
        }
        if (i == 0) {
            TextView textView = this.f1040f;
            mw5 mw5Var3 = this.f1035a;
            hw5 hw5Var3 = mw5Var3.f51955n;
            Context context = hw5Var3.f43037a;
            char c = hw5Var3.mo13531n() ? mw5Var3.f51951j : mw5Var3.f51949h;
            if (c == 0) {
                string = "";
            } else {
                Resources resources = context.getResources();
                StringBuilder sb = new StringBuilder();
                if (ViewConfiguration.get(context).hasPermanentMenuKey()) {
                    sb.append(resources.getString(R$string.abc_prepend_shortcut_label));
                }
                int i2 = hw5Var3.mo13531n() ? mw5Var3.f51952k : mw5Var3.f51950i;
                mw5.m17073c(i2, 65536, resources.getString(R$string.abc_menu_meta_shortcut_label), sb);
                mw5.m17073c(i2, 4096, resources.getString(R$string.abc_menu_ctrl_shortcut_label), sb);
                mw5.m17073c(i2, 2, resources.getString(R$string.abc_menu_alt_shortcut_label), sb);
                mw5.m17073c(i2, 1, resources.getString(R$string.abc_menu_shift_shortcut_label), sb);
                mw5.m17073c(i2, 4, resources.getString(R$string.abc_menu_sym_shortcut_label), sb);
                mw5.m17073c(i2, 8, resources.getString(R$string.abc_menu_function_shortcut_label), sb);
                if (c == '\b') {
                    sb.append(resources.getString(R$string.abc_menu_delete_shortcut_label));
                } else if (c == '\n') {
                    sb.append(resources.getString(R$string.abc_menu_enter_shortcut_label));
                } else if (c != ' ') {
                    sb.append(c);
                } else {
                    sb.append(resources.getString(R$string.abc_menu_space_shortcut_label));
                }
                string = sb.toString();
            }
            textView.setText(string);
        }
        if (this.f1040f.getVisibility() != i) {
            this.f1040f.setVisibility(i);
        }
        setIcon(mw5Var.getIcon());
        setEnabled(mw5Var.isEnabled());
        setSubMenuArrowVisible(mw5Var.hasSubMenu());
        setContentDescription(mw5Var.f51958q);
    }

    @Override // p000.hx5
    public mw5 getItemData() {
        return this.f1035a;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.f1044j);
        TextView textView = (TextView) findViewById(R$id.title);
        this.f1038d = textView;
        int i = this.f1045k;
        if (i != -1) {
            textView.setTextAppearance(this.f1046l, i);
        }
        this.f1040f = (TextView) findViewById(R$id.shortcut);
        ImageView imageView = (ImageView) findViewById(R$id.submenuarrow);
        this.f1041g = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f1031I);
        }
        this.f1042h = (ImageView) findViewById(R$id.group_divider);
        this.f1043i = (LinearLayout) findViewById(R$id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.f1036b != null && this.f1030H) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f1036b.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        View view;
        if (!z && this.f1037c == null && this.f1039e == null) {
            return;
        }
        if ((this.f1035a.f51965x & 4) != 0) {
            if (this.f1037c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R$layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f1037c = radioButton;
                LinearLayout linearLayout = this.f1043i;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f1037c;
            view = this.f1039e;
        } else {
            if (this.f1039e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R$layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f1039e = checkBox;
                LinearLayout linearLayout2 = this.f1043i;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f1039e;
            view = this.f1037c;
        }
        if (z) {
            compoundButton.setChecked(this.f1035a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.f1039e;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f1037c;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if ((this.f1035a.f51965x & 4) != 0) {
            if (this.f1037c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R$layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f1037c = radioButton;
                LinearLayout linearLayout = this.f1043i;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f1037c;
        } else {
            if (this.f1039e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R$layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f1039e = checkBox;
                LinearLayout linearLayout2 = this.f1043i;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f1039e;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.f1034L = z;
        this.f1030H = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.f1042h;
        if (imageView != null) {
            imageView.setVisibility((this.f1032J || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        hw5 hw5Var = this.f1035a.f51955n;
        boolean z = this.f1034L;
        if (z || this.f1030H) {
            ImageView imageView = this.f1036b;
            if (imageView == null && drawable == null && !this.f1030H) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R$layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f1036b = imageView2;
                LinearLayout linearLayout = this.f1043i;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f1030H) {
                this.f1036b.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f1036b;
            if (!z) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f1036b.getVisibility() != 0) {
                this.f1036b.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        TextView textView = this.f1038d;
        if (charSequence == null) {
            if (textView.getVisibility() != 8) {
                this.f1038d.setVisibility(8);
            }
        } else {
            textView.setText(charSequence);
            if (this.f1038d.getVisibility() != 0) {
                this.f1038d.setVisibility(0);
            }
        }
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.listMenuViewStyle);
    }
}
