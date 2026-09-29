package androidx.appcompat.view.menu;

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
import androidx.appcompat.widget.C0300b1;
import com.linguist.R;
import java.util.WeakHashMap;
import p058d.C4999a;
import p471x2.C10029b0;
import p471x2.C10049l0;

/* JADX INFO: loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements InterfaceC0229k.a, AbsListView.SelectionBoundsAdjuster {

    /* JADX INFO: renamed from: H */
    public boolean f616H;

    /* JADX INFO: renamed from: I */
    public final Drawable f617I;

    /* JADX INFO: renamed from: J */
    public final boolean f618J;

    /* JADX INFO: renamed from: K */
    public LayoutInflater f619K;

    /* JADX INFO: renamed from: L */
    public boolean f620L;

    /* JADX INFO: renamed from: a */
    public C0226h f621a;

    /* JADX INFO: renamed from: b */
    public ImageView f622b;

    /* JADX INFO: renamed from: c */
    public RadioButton f623c;

    /* JADX INFO: renamed from: d */
    public TextView f624d;

    /* JADX INFO: renamed from: e */
    public CheckBox f625e;

    /* JADX INFO: renamed from: f */
    public TextView f626f;

    /* JADX INFO: renamed from: g */
    public ImageView f627g;

    /* JADX INFO: renamed from: h */
    public ImageView f628h;

    /* JADX INFO: renamed from: i */
    public LinearLayout f629i;

    /* JADX INFO: renamed from: j */
    public final Drawable f630j;

    /* JADX INFO: renamed from: k */
    public final int f631k;

    /* JADX INFO: renamed from: l */
    public final Context f632l;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0300b1 c0300b1M1111m = C0300b1.m1111m(getContext(), attributeSet, C4999a.f32604r, R.attr.listMenuViewStyle);
        this.f630j = c0300b1M1111m.m1116e(5);
        this.f631k = c0300b1M1111m.m1120i(1, -1);
        this.f616H = c0300b1M1111m.m1112a(7, false);
        this.f632l = context;
        this.f617I = c0300b1M1111m.m1116e(8);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.f618J = typedArrayObtainStyledAttributes.hasValue(0);
        c0300b1M1111m.m1124n();
        typedArrayObtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f619K == null) {
            this.f619K = LayoutInflater.from(getContext());
        }
        return this.f619K;
    }

    private void setSubMenuArrowVisible(boolean z10) {
        ImageView imageView = this.f627g;
        if (imageView != null) {
            imageView.setVisibility(z10 ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f628h;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f628h.getLayoutParams();
        rect.top = this.f628h.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0043  */
    /* JADX WARN: Code duplicated, block: B:25:0x0065  */
    /* JADX WARN: Code duplicated, block: B:28:0x006b  */
    @Override // androidx.appcompat.view.menu.InterfaceC0229k.a
    /* JADX INFO: renamed from: d */
    public final void mo232d(C0226h c0226h) {
        boolean z10;
        String string;
        boolean z11;
        this.f621a = c0226h;
        int i10 = 0;
        setVisibility(c0226h.isVisible() ? 0 : 8);
        setTitle(c0226h.f727e);
        setCheckable(c0226h.isCheckable());
        C0224f c0224f = c0226h.f736n;
        if (c0224f.mo931o()) {
            if ((c0224f.mo930n() ? c0226h.f732j : c0226h.f730h) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        c0224f.mo930n();
        if (z10) {
            C0226h c0226h2 = this.f621a;
            C0224f c0224f2 = c0226h2.f736n;
            if (c0224f2.mo931o()) {
                if ((c0224f2.mo930n() ? c0226h2.f732j : c0226h2.f730h) != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            } else {
                z11 = false;
            }
            if (!z11) {
                i10 = 8;
            }
        } else {
            i10 = 8;
        }
        if (i10 == 0) {
            TextView textView = this.f626f;
            C0226h c0226h3 = this.f621a;
            char c10 = c0226h3.f736n.mo930n() ? c0226h3.f732j : c0226h3.f730h;
            if (c10 == 0) {
                string = "";
            } else {
                C0224f c0224f3 = c0226h3.f736n;
                Resources resources = c0224f3.f693a.getResources();
                StringBuilder sb2 = new StringBuilder();
                if (ViewConfiguration.get(c0224f3.f693a).hasPermanentMenuKey()) {
                    sb2.append(resources.getString(R.string.abc_prepend_shortcut_label));
                }
                int i11 = c0224f3.mo930n() ? c0226h3.f733k : c0226h3.f731i;
                C0226h.m944c(i11, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label), sb2);
                C0226h.m944c(i11, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label), sb2);
                C0226h.m944c(i11, 2, resources.getString(R.string.abc_menu_alt_shortcut_label), sb2);
                C0226h.m944c(i11, 1, resources.getString(R.string.abc_menu_shift_shortcut_label), sb2);
                C0226h.m944c(i11, 4, resources.getString(R.string.abc_menu_sym_shortcut_label), sb2);
                C0226h.m944c(i11, 8, resources.getString(R.string.abc_menu_function_shortcut_label), sb2);
                if (c10 == '\b') {
                    sb2.append(resources.getString(R.string.abc_menu_delete_shortcut_label));
                } else if (c10 == '\n') {
                    sb2.append(resources.getString(R.string.abc_menu_enter_shortcut_label));
                } else if (c10 != ' ') {
                    sb2.append(c10);
                } else {
                    sb2.append(resources.getString(R.string.abc_menu_space_shortcut_label));
                }
                string = sb2.toString();
            }
            textView.setText(string);
        }
        if (this.f626f.getVisibility() != i10) {
            this.f626f.setVisibility(i10);
        }
        setIcon(c0226h.getIcon());
        setEnabled(c0226h.isEnabled());
        setSubMenuArrowVisible(c0226h.hasSubMenu());
        setContentDescription(c0226h.f739q);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0229k.a
    public C0226h getItemData() {
        return this.f621a;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
        C10029b0.d.m18680q(this, this.f630j);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f624d = textView;
        int i10 = this.f631k;
        if (i10 != -1) {
            textView.setTextAppearance(this.f632l, i10);
        }
        this.f626f = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f627g = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f617I);
        }
        this.f628h = (ImageView) findViewById(R.id.group_divider);
        this.f629i = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        if (this.f622b != null && this.f616H) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f622b.getLayoutParams();
            int i12 = layoutParams.height;
            if (i12 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i12;
            }
        }
        super.onMeasure(i10, i11);
    }

    public void setCheckable(boolean z10) {
        CompoundButton compoundButton;
        View view;
        if (!z10 && this.f623c == null && this.f625e == null) {
            return;
        }
        if ((this.f621a.f746x & 4) != 0) {
            if (this.f623c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f623c = radioButton;
                LinearLayout linearLayout = this.f629i;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f623c;
            view = this.f625e;
        } else {
            if (this.f625e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f625e = checkBox;
                LinearLayout linearLayout2 = this.f629i;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f625e;
            view = this.f623c;
        }
        if (z10) {
            compoundButton.setChecked(this.f621a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.f625e;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f623c;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z10) {
        CompoundButton compoundButton;
        if ((this.f621a.f746x & 4) != 0) {
            if (this.f623c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f623c = radioButton;
                LinearLayout linearLayout = this.f629i;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f623c;
        } else {
            if (this.f625e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f625e = checkBox;
                LinearLayout linearLayout2 = this.f629i;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f625e;
        }
        compoundButton.setChecked(z10);
    }

    public void setForceShowIcon(boolean z10) {
        this.f620L = z10;
        this.f616H = z10;
    }

    public void setGroupDividerEnabled(boolean z10) {
        ImageView imageView = this.f628h;
        if (imageView != null) {
            imageView.setVisibility((this.f618J || !z10) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        this.f621a.f736n.getClass();
        boolean z10 = this.f620L;
        if (z10 || this.f616H) {
            ImageView imageView = this.f622b;
            if (imageView == null && drawable == null && !this.f616H) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f622b = imageView2;
                LinearLayout linearLayout = this.f629i;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f616H) {
                this.f622b.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f622b;
            if (!z10) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f622b.getVisibility() != 0) {
                this.f622b.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f624d.getVisibility() != 8) {
                this.f624d.setVisibility(8);
            }
        } else {
            this.f624d.setText(charSequence);
            if (this.f624d.getVisibility() != 0) {
                this.f624d.setVisibility(0);
            }
        }
    }
}
