package p000;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.apps.camera.bottombar.C0100R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ggg extends ConstraintLayout {

    /* JADX INFO: renamed from: a */
    public static final nbh f24653a = nbh.m17259h("com/google/android/apps/camera/optionsbar/view/OptionsMenuRow");

    /* JADX INFO: renamed from: b */
    public final Map f24654b;

    /* JADX INFO: renamed from: c */
    public final gfl f24655c;

    /* JADX INFO: renamed from: d */
    public final int f24656d;

    /* JADX INFO: renamed from: e */
    public final gfe f24657e;

    /* JADX INFO: renamed from: f */
    public final gfd f24658f;

    /* JADX INFO: renamed from: g */
    public gfc f24659g;

    /* JADX INFO: renamed from: h */
    private final ArrayList f24660h;

    /* JADX INFO: renamed from: i */
    private final Map f24661i;

    /* JADX INFO: renamed from: j */
    private final TextView f24662j;

    /* JADX INFO: renamed from: k */
    private final TextView f24663k;

    /* JADX INFO: renamed from: l */
    private final LinearLayout f24664l;

    /* JADX INFO: renamed from: m */
    private final ImageView f24665m;

    /* JADX INFO: renamed from: n */
    private final Context f24666n;

    /* JADX INFO: renamed from: o */
    private final boolean f24667o;

    /* JADX INFO: renamed from: p */
    private final boolean f24668p;

    /* JADX INFO: renamed from: q */
    private final boolean f24669q;

    /* JADX INFO: renamed from: r */
    private final gff f24670r;

    public ggg(Context context, gfl gflVar, gfc gfcVar, gfe gfeVar, gff gffVar, gfd gfdVar, int i, boolean z, boolean z2) {
        super(context);
        this.f24655c = gflVar;
        this.f24659g = gfcVar;
        this.f24666n = context;
        this.f24657e = gfeVar;
        this.f24670r = gffVar;
        this.f24658f = gfdVar;
        this.f24656d = i;
        this.f24667o = z;
        this.f24668p = z2;
        this.f24669q = gffVar != null;
        this.f24660h = new ArrayList();
        this.f24654b = new HashMap();
        this.f24661i = new HashMap();
        TextView textView = new TextView(context);
        this.f24662j = textView;
        textView.setId(View.generateViewId());
        TextView textView2 = new TextView(context);
        this.f24663k = textView2;
        textView2.setId(View.generateViewId());
        LinearLayout linearLayout = new LinearLayout(context);
        this.f24664l = linearLayout;
        linearLayout.setId(View.generateViewId());
        ImageView imageView = new ImageView(context);
        this.f24665m = imageView;
        imageView.setId(View.generateViewId());
    }

    /* JADX INFO: renamed from: a */
    public final gev m9203a() {
        return this.f24655c.f24580a;
    }

    /* JADX INFO: renamed from: b */
    public final void m9204b(String str) {
        ArrayList arrayList = this.f24660h;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ImageButton imageButton = (ImageButton) ((FrameLayout) arrayList.get(i)).getChildAt(0);
            imageButton.setEnabled(false);
            imageButton.setImageAlpha(153);
        }
        ImageButton imageButton2 = (ImageButton) this.f24654b.get(this.f24659g);
        if (imageButton2 != null) {
            imageButton2.setSelected(false);
        }
        if (TextUtils.isEmpty(str)) {
            this.f24663k.setText(C0100R.string.options_menu_disabled);
            this.f24663k.setContentDescription(getResources().getString(C0100R.string.options_menu_disabled_desc));
        } else {
            this.f24663k.setText(str);
            this.f24663k.setContentDescription(str);
        }
        this.f24663k.setTextColor(jzn.m13838z(this));
        if (this.f24669q && this.f24668p) {
            this.f24665m.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m9205c(gfc gfcVar) {
        ImageButton imageButton = (ImageButton) this.f24654b.get(gfcVar);
        if (imageButton == null) {
            ((nbe) ((nbe) f24653a.m17252c()).mo17276G(2621)).mo17301z("disableOption: nonexistent option %s for category %s", gfcVar, m9203a());
        } else if (imageButton != ((ImageButton) this.f24654b.get(this.f24659g))) {
            imageButton.setEnabled(false);
            imageButton.setImageAlpha(153);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m9206d() {
        ArrayList arrayList = this.f24660h;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ImageButton imageButton = (ImageButton) ((FrameLayout) arrayList.get(i)).getChildAt(0);
            imageButton.setEnabled(true);
            imageButton.setImageAlpha(255);
        }
        ImageButton imageButton2 = (ImageButton) this.f24654b.get(this.f24659g);
        if (imageButton2 != null) {
            imageButton2.setSelected(true);
            gfm gfmVar = (gfm) this.f24661i.get(imageButton2);
            gfmVar.getClass();
            this.f24663k.setText(gfmVar.f24586c);
            this.f24663k.setContentDescription(gfmVar.f24587d);
            this.f24663k.setTextColor(jzn.m13799B(this));
        }
        if (this.f24669q && this.f24668p) {
            this.f24665m.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m9207e() {
        gfm gfmVar;
        int i = 0;
        char c = 1;
        int[][] iArr = {new int[]{R.attr.state_selected}, new int[0]};
        int[] iArr2 = new int[2];
        iArr2[0] = jzn.m13800C(this);
        iArr2[1] = this.f24667o ? 0 : jzn.m13802E(this);
        ColorStateList colorStateList = new ColorStateList(iArr, iArr2);
        ColorStateList colorStateList2 = new ColorStateList(iArr, new int[]{jzn.m13837y(this), jzn.m13838z(this)});
        for (int size = this.f24655c.f24583d.size() - 1; size >= 0; size--) {
            ImageButton imageButton = new ImageButton(this.f24666n);
            imageButton.setId(View.generateViewId());
            FrameLayout frameLayout = new FrameLayout(this.f24666n);
            frameLayout.addView(imageButton, new C1178zm(-1, -1));
            frameLayout.setId(View.generateViewId());
            this.f24660h.add(frameLayout);
        }
        C1190zy c1190zy = new C1190zy();
        c1190zy.m19820e(this);
        if (!this.f24667o) {
            this.f24662j.setText(this.f24655c.f24581b);
            this.f24662j.setContentDescription(getResources().getString(this.f24655c.f24582c));
            this.f24662j.setTextAppearance(jzn.m13804G(getContext(), C0100R.attr.textAppearanceCaption));
            this.f24662j.setTypeface(getResources().getFont(C0100R.font.google_sans));
            this.f24662j.setTextColor(jzn.m13836x(this));
            this.f24662j.setTextDirection(5);
            c1190zy.m19823h(this.f24662j.getId(), 6, 0, 6, getResources().getDimensionPixelSize(C0100R.dimen.options_menu_label_margin_left));
            c1190zy.m19823h(this.f24662j.getId(), 3, 0, 3, getResources().getDimensionPixelSize(C0100R.dimen.options_menu_label_margin_top));
            if (this.f24655c.f24583d.size() < 5) {
                c1190zy.m19823h(this.f24662j.getId(), 7, ((FrameLayout) this.f24660h.get(0)).getId(), 6, getResources().getDimensionPixelSize(C0100R.dimen.options_menu_button_margin_left));
                c1190zy.m19823h(this.f24664l.getId(), 7, ((FrameLayout) this.f24660h.get(0)).getId(), 6, getResources().getDimensionPixelSize(C0100R.dimen.options_menu_button_margin_left));
            } else {
                c1190zy.m19823h(this.f24662j.getId(), 7, ((FrameLayout) this.f24660h.get(this.f24655c.f24583d.size() - 3)).getId(), 6, getResources().getDimensionPixelSize(C0100R.dimen.options_menu_button_margin_left));
            }
            c1190zy.m19824i(this.f24662j.getId(), -2);
            c1190zy.m19825j(this.f24662j.getId(), 0);
            addView(this.f24662j);
            mws mwsVar = this.f24655c.f24583d;
            int size2 = mwsVar.size();
            int i2 = 0;
            do {
                if (i2 >= size2) {
                    gfmVar = null;
                    break;
                } else {
                    gfmVar = (gfm) mwsVar.get(i2);
                    i2++;
                }
            } while (gfmVar.f24584a != this.f24659g);
            if (gfmVar != null) {
                this.f24663k.setText(gfmVar.f24586c);
                this.f24663k.setContentDescription(gfmVar.f24587d);
            }
            this.f24663k.setTextAppearance(jzn.m13804G(getContext(), C0100R.attr.textAppearanceSubhead1));
            this.f24663k.setTypeface(getResources().getFont(C0100R.font.google_sans));
            this.f24663k.setTextColor(jzn.m13799B(this));
            this.f24663k.setTextDirection(5);
            this.f24664l.setOrientation(0);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 16;
            this.f24664l.addView(this.f24663k, layoutParams);
            if (this.f24669q) {
                Drawable drawable = this.f24666n.getDrawable(C0100R.drawable.help_outline);
                if (drawable != null) {
                    drawable.setTint(jzn.m13799B(this));
                }
                this.f24665m.setImageDrawable(drawable);
                this.f24665m.setBackgroundColor(0);
                this.f24665m.setPadding(getResources().getDimensionPixelSize(C0100R.dimen.help_outline_padding_left), 0, 0, 0);
                this.f24664l.addView(this.f24665m, layoutParams);
                this.f24664l.setOnClickListener(new ggf(this, this.f24670r, c == true ? 1 : 0));
            }
            c1190zy.m19824i(this.f24664l.getId(), -2);
            c1190zy.m19825j(this.f24664l.getId(), 0);
            c1190zy.m19823h(this.f24664l.getId(), 6, 0, 6, getResources().getDimensionPixelSize(C0100R.dimen.options_menu_label_margin_left));
            c1190zy.m19817b(this.f24664l.getId()).f48481d.f48496K = getResources().getDimensionPixelSize(C0100R.dimen.options_menu_label_margin_top);
            c1190zy.m19823h(this.f24664l.getId(), 3, this.f24662j.getId(), 4, getResources().getDimensionPixelSize(C0100R.dimen.options_menu_label_margin_bottom));
            addView(this.f24664l);
        }
        int dimensionPixelSize = this.f24667o ? 0 : getResources().getDimensionPixelSize(C0100R.dimen.options_menu_button_margin_top);
        int dimensionPixelSize2 = this.f24667o ? 0 : getResources().getDimensionPixelSize(C0100R.dimen.options_menu_button_margin_right);
        int size3 = this.f24655c.f24583d.size();
        int i3 = C0100R.drawable.value_icon_background;
        int i4 = C0100R.dimen.options_menu_button_size;
        if (size3 < 5) {
            int size4 = this.f24655c.f24583d.size() - 1;
            while (size4 >= 0) {
                FrameLayout frameLayout2 = (FrameLayout) this.f24660h.get(size4);
                ImageButton imageButton2 = (ImageButton) frameLayout2.getChildAt(0);
                gfm gfmVar2 = (gfm) this.f24655c.f24583d.get(size4);
                this.f24654b.put(gfmVar2.f24584a, imageButton2);
                this.f24661i.put(imageButton2, gfmVar2);
                imageButton2.setContentDescription(gfmVar2.f24587d);
                imageButton2.setOnClickListener(new ggf(this, gfmVar2, i));
                c1190zy.m19824i(frameLayout2.getId(), getResources().getDimensionPixelSize(i4));
                c1190zy.m19825j(frameLayout2.getId(), getResources().getDimensionPixelSize(i4));
                imageButton2.setImageDrawable(gfmVar2.f24585b);
                imageButton2.getDrawable().setAutoMirrored(false);
                imageButton2.setBackgroundResource(i3);
                imageButton2.setBackgroundTintList(colorStateList);
                imageButton2.setImageTintList(colorStateList2);
                imageButton2.setSelected(gfmVar2.f24584a.equals(this.f24659g));
                if (size4 == this.f24655c.f24583d.size() - 1) {
                    c1190zy.m19823h(frameLayout2.getId(), 7, 0, 7, dimensionPixelSize2);
                }
                int i5 = size4 + 1;
                if (i5 < this.f24655c.f24583d.size()) {
                    c1190zy.m19823h(frameLayout2.getId(), 7, ((FrameLayout) this.f24660h.get(i5)).getId(), 6, 0);
                }
                int i6 = dimensionPixelSize;
                c1190zy.m19823h(frameLayout2.getId(), 4, 0, 4, i6);
                c1190zy.m19823h(frameLayout2.getId(), 3, 0, 3, i6);
                addView(frameLayout2);
                size4--;
                i4 = C0100R.dimen.options_menu_button_size;
                i3 = C0100R.drawable.value_icon_background;
            }
        } else {
            lku.m15669w(this.f24655c.f24583d.size() <= 6);
            for (int size5 = this.f24655c.f24583d.size() - 1; size5 >= 0; size5--) {
                FrameLayout frameLayout3 = (FrameLayout) this.f24660h.get(size5);
                ImageButton imageButton3 = (ImageButton) frameLayout3.getChildAt(0);
                gfm gfmVar3 = (gfm) this.f24655c.f24583d.get(size5);
                this.f24654b.put(gfmVar3.f24584a, imageButton3);
                this.f24661i.put(imageButton3, gfmVar3);
                imageButton3.setContentDescription(gfmVar3.f24587d);
                imageButton3.setOnClickListener(new ggf(this, gfmVar3, 2));
                c1190zy.m19824i(frameLayout3.getId(), getResources().getDimensionPixelSize(C0100R.dimen.options_menu_button_size));
                c1190zy.m19825j(frameLayout3.getId(), getResources().getDimensionPixelSize(C0100R.dimen.options_menu_button_size));
                imageButton3.setImageDrawable(gfmVar3.f24585b);
                imageButton3.getDrawable().setAutoMirrored(false);
                imageButton3.setBackgroundResource(C0100R.drawable.value_icon_background);
                imageButton3.setBackgroundTintList(colorStateList);
                imageButton3.setImageTintList(colorStateList2);
                imageButton3.setSelected(gfmVar3.f24584a.equals(this.f24659g));
                if (size5 == this.f24655c.f24583d.size() - 1 || size5 == this.f24655c.f24583d.size() - 4) {
                    c1190zy.m19823h(frameLayout3.getId(), 7, 0, 7, dimensionPixelSize2);
                } else {
                    int i7 = size5 + 1;
                    if (i7 < this.f24655c.f24583d.size()) {
                        c1190zy.m19823h(frameLayout3.getId(), 7, ((FrameLayout) this.f24660h.get(i7)).getId(), 6, 0);
                    }
                }
                if (size5 >= this.f24655c.f24583d.size() - 3) {
                    c1190zy.m19823h(frameLayout3.getId(), 3, 0, 3, dimensionPixelSize);
                } else {
                    c1190zy.m19823h(frameLayout3.getId(), 4, 0, 4, dimensionPixelSize);
                    c1190zy.m19823h(frameLayout3.getId(), 3, ((FrameLayout) this.f24660h.get(size5 + 3)).getId(), 4, 0);
                }
                addView(frameLayout3);
            }
        }
        c1190zy.m19818c(this);
    }

    /* JADX INFO: renamed from: f */
    public final void m9208f(gfc gfcVar) {
        this.f24659g = gfcVar;
        if (isEnabled()) {
            ArrayList arrayList = this.f24660h;
            int size = arrayList.size();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                ImageButton imageButton = (ImageButton) ((FrameLayout) arrayList.get(i2)).getChildAt(0);
                imageButton.setSelected(this.f24654b.get(gfcVar) == imageButton);
            }
            mws mwsVar = this.f24655c.f24583d;
            int size2 = mwsVar.size();
            while (i < size2) {
                gfm gfmVar = (gfm) mwsVar.get(i);
                i++;
                if (gfmVar.f24584a == gfcVar) {
                    this.f24663k.setText(gfmVar.f24586c);
                    String str = gfmVar.f24587d;
                    this.f24663k.setContentDescription(str);
                    this.f24663k.announceForAccessibility(str);
                    return;
                }
            }
        }
    }
}
