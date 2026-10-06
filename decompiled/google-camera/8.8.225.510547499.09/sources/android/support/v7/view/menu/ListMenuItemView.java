package android.support.v7.view.menu;

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
import androidx.wear.ambient.AmbientDelegate;
import com.google.android.apps.camera.bottombar.C0100R;
import p000.C0193fr;
import p000.C0225gw;
import p000.C0227gy;
import p000.InterfaceC0240hk;
import p000.afb;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements AbsListView.SelectionBoundsAdjuster, InterfaceC0240hk {

    /* JADX INFO: renamed from: a */
    public C0227gy f921a;

    /* JADX INFO: renamed from: b */
    public ImageView f922b;

    /* JADX INFO: renamed from: c */
    public boolean f923c;

    /* JADX INFO: renamed from: d */
    public boolean f924d;

    /* JADX INFO: renamed from: e */
    public boolean f925e;

    /* JADX INFO: renamed from: f */
    private ImageView f926f;

    /* JADX INFO: renamed from: g */
    private RadioButton f927g;

    /* JADX INFO: renamed from: h */
    private TextView f928h;

    /* JADX INFO: renamed from: i */
    private CheckBox f929i;

    /* JADX INFO: renamed from: j */
    private TextView f930j;

    /* JADX INFO: renamed from: k */
    private ImageView f931k;

    /* JADX INFO: renamed from: l */
    private LinearLayout f932l;

    /* JADX INFO: renamed from: m */
    private Drawable f933m;

    /* JADX INFO: renamed from: n */
    private int f934n;

    /* JADX INFO: renamed from: o */
    private Context f935o;

    /* JADX INFO: renamed from: p */
    private Drawable f936p;

    /* JADX INFO: renamed from: q */
    private LayoutInflater f937q;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0100R.attr.listMenuViewStyle);
    }

    /* JADX INFO: renamed from: b */
    private final LayoutInflater m1038b() {
        if (this.f937q == null) {
            this.f937q = LayoutInflater.from(getContext());
        }
        return this.f937q;
    }

    /* JADX INFO: renamed from: c */
    private final void m1039c(View view) {
        m1040d(view, -1);
    }

    /* JADX INFO: renamed from: d */
    private final void m1040d(View view, int i) {
        LinearLayout linearLayout = this.f932l;
        if (linearLayout != null) {
            linearLayout.addView(view, i);
        } else {
            addView(view, i);
        }
    }

    @Override // p000.InterfaceC0240hk
    /* JADX INFO: renamed from: a */
    public final C0227gy mo1030a() {
        return this.f921a;
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f922b;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f922b.getLayoutParams();
        rect.top += this.f922b.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // p000.InterfaceC0240hk
    /* JADX INFO: renamed from: e */
    public final boolean mo1034e() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [android.support.v7.view.menu.ListMenuItemView, android.view.ViewGroup, hk] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v3, types: [android.widget.CheckBox] */
    @Override // p000.InterfaceC0240hk
    /* JADX INFO: renamed from: f */
    public final void mo1035f(C0227gy c0227gy) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        ?? r5;
        ImageView imageView;
        String string;
        this.f921a = c0227gy;
        setVisibility(true != c0227gy.isVisible() ? 8 : 0);
        CharSequence charSequenceM9950f = c0227gy.m9950f(this);
        if (charSequenceM9950f != null) {
            this.f928h.setText(charSequenceM9950f);
            if (this.f928h.getVisibility() != 0) {
                this.f928h.setVisibility(0);
            }
        } else if (this.f928h.getVisibility() != 8) {
            this.f928h.setVisibility(8);
        }
        boolean zIsCheckable = c0227gy.isCheckable();
        if (zIsCheckable || this.f927g != null || this.f929i != null) {
            if (this.f921a.m9959p()) {
                if (this.f927g == null) {
                    RadioButton radioButton = (RadioButton) m1038b().inflate(C0100R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                    this.f927g = radioButton;
                    m1039c(radioButton);
                }
                compoundButton = this.f927g;
                CheckBox checkBox = this.f929i;
                compoundButton2 = checkBox;
                r5 = checkBox;
            } else {
                if (this.f929i == null) {
                    CheckBox checkBox2 = (CheckBox) m1038b().inflate(C0100R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                    this.f929i = checkBox2;
                    m1039c(checkBox2);
                }
                compoundButton = this.f929i;
                compoundButton2 = this.f927g;
                r5 = compoundButton;
            }
            if (zIsCheckable) {
                compoundButton.setChecked(this.f921a.isChecked());
                if (compoundButton.getVisibility() != 0) {
                    compoundButton.setVisibility(0);
                }
                if (compoundButton2 != null && compoundButton2.getVisibility() != 8) {
                    compoundButton2.setVisibility(8);
                }
            } else {
                if (r5 != 0) {
                    r5.setVisibility(8);
                }
                RadioButton radioButton2 = this.f927g;
                if (radioButton2 != null) {
                    radioButton2.setVisibility(8);
                }
            }
        }
        boolean zM9963t = c0227gy.m9963t();
        c0227gy.m9949e();
        int i = (zM9963t && this.f921a.m9963t()) ? 0 : 8;
        if (i == 0) {
            TextView textView = this.f930j;
            C0227gy c0227gy2 = this.f921a;
            char cM9949e = c0227gy2.m9949e();
            if (cM9949e == 0) {
                string = "";
            } else {
                Resources resources = c0227gy2.f26796j.f26547a.getResources();
                StringBuilder sb = new StringBuilder();
                if (ViewConfiguration.get(c0227gy2.f26796j.f26547a).hasPermanentMenuKey()) {
                    sb.append(resources.getString(C0100R.string.abc_prepend_shortcut_label));
                }
                int i2 = c0227gy2.f26796j.mo9844x() ? c0227gy2.f26795i : c0227gy2.f26793g;
                C0227gy.m9947g(sb, i2, 65536, resources.getString(C0100R.string.abc_menu_meta_shortcut_label));
                C0227gy.m9947g(sb, i2, 4096, resources.getString(C0100R.string.abc_menu_ctrl_shortcut_label));
                C0227gy.m9947g(sb, i2, 2, resources.getString(C0100R.string.abc_menu_alt_shortcut_label));
                C0227gy.m9947g(sb, i2, 1, resources.getString(C0100R.string.abc_menu_shift_shortcut_label));
                C0227gy.m9947g(sb, i2, 4, resources.getString(C0100R.string.abc_menu_sym_shortcut_label));
                C0227gy.m9947g(sb, i2, 8, resources.getString(C0100R.string.abc_menu_function_shortcut_label));
                switch (cM9949e) {
                    case '\b':
                        sb.append(resources.getString(C0100R.string.abc_menu_delete_shortcut_label));
                        break;
                    case '\n':
                        sb.append(resources.getString(C0100R.string.abc_menu_enter_shortcut_label));
                        break;
                    case ' ':
                        sb.append(resources.getString(C0100R.string.abc_menu_space_shortcut_label));
                        break;
                    default:
                        sb.append(cM9949e);
                        break;
                }
                string = sb.toString();
            }
            textView.setText(string);
        }
        if (this.f930j.getVisibility() != i) {
            this.f930j.setVisibility(i);
        }
        Drawable icon = c0227gy.getIcon();
        C0225gw c0225gw = this.f921a.f26796j;
        boolean z = this.f925e;
        if ((z || this.f923c) && ((imageView = this.f926f) != null || icon != null || this.f923c)) {
            if (imageView == null) {
                ImageView imageView2 = (ImageView) m1038b().inflate(C0100R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f926f = imageView2;
                m1040d(imageView2, 0);
            }
            if (icon != null || this.f923c) {
                ImageView imageView3 = this.f926f;
                if (true != z) {
                    icon = null;
                }
                imageView3.setImageDrawable(icon);
                if (this.f926f.getVisibility() != 0) {
                    this.f926f.setVisibility(0);
                }
            } else {
                this.f926f.setVisibility(8);
            }
        }
        setEnabled(c0227gy.isEnabled());
        boolean zHasSubMenu = c0227gy.hasSubMenu();
        ImageView imageView4 = this.f931k;
        if (imageView4 != null) {
            imageView4.setVisibility(true != zHasSubMenu ? 8 : 0);
        }
        setContentDescription(c0227gy.f26798l);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        afb.m432m(this, this.f933m);
        TextView textView = (TextView) findViewById(C0100R.id.title);
        this.f928h = textView;
        int i = this.f934n;
        if (i != -1) {
            textView.setTextAppearance(this.f935o, i);
        }
        this.f930j = (TextView) findViewById(C0100R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(C0100R.id.submenuarrow);
        this.f931k = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f936p);
        }
        this.f922b = (ImageView) findViewById(C0100R.id.group_divider);
        this.f932l = (LinearLayout) findViewById(C0100R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        if (this.f926f != null && this.f923c) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f926f.getLayoutParams();
            if (layoutParams.height > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = layoutParams.height;
            }
        }
        super.onMeasure(i, i2);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        AmbientDelegate ambientDelegateM1568D = AmbientDelegate.m1568D(getContext(), attributeSet, C0193fr.f23274r, i, 0);
        this.f933m = ambientDelegateM1568D.m1618u(5);
        this.f934n = ambientDelegateM1568D.m1616s(1, -1);
        this.f923c = ambientDelegateM1568D.m1623z(7, false);
        this.f935o = context;
        this.f936p = ambientDelegateM1568D.m1618u(8);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, C0100R.attr.dropDownListViewStyle, 0);
        this.f924d = typedArrayObtainStyledAttributes.hasValue(0);
        ambientDelegateM1568D.m1622y();
        typedArrayObtainStyledAttributes.recycle();
    }
}
