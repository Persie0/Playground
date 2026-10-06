package p000;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.wear.ambient.AmbientModeSupport;
import com.google.android.apps.camera.bottombar.C0100R;
import p021j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class idu extends PopupWindow implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: m */
    private static final Duration f30505m = Duration.ofMillis(100);

    /* JADX INFO: renamed from: a */
    public final View f30506a;

    /* JADX INFO: renamed from: b */
    public final idv f30507b;

    /* JADX INFO: renamed from: c */
    public hzj f30508c;

    /* JADX INFO: renamed from: d */
    public idt f30509d;

    /* JADX INFO: renamed from: e */
    public final View.OnLayoutChangeListener f30510e;

    /* JADX INFO: renamed from: f */
    public final int f30511f;

    /* JADX INFO: renamed from: g */
    public final int f30512g;

    /* JADX INFO: renamed from: h */
    public ilk f30513h;

    /* JADX INFO: renamed from: i */
    public int f30514i;

    /* JADX INFO: renamed from: j */
    public int f30515j;

    /* JADX INFO: renamed from: k */
    public int f30516k;

    /* JADX INFO: renamed from: l */
    public AmbientModeSupport.AmbientController f30517l;

    /* JADX INFO: renamed from: n */
    private final Context f30518n;

    /* JADX INFO: renamed from: o */
    private final Handler f30519o;

    /* JADX INFO: renamed from: p */
    private TextView f30520p;

    /* JADX INFO: renamed from: q */
    private ImageButton f30521q;

    /* JADX INFO: renamed from: r */
    private ListView f30522r;

    /* JADX INFO: renamed from: s */
    private final int f30523s;

    /* JADX INFO: renamed from: t */
    private final int f30524t;

    /* JADX INFO: renamed from: u */
    private final int f30525u;

    /* JADX INFO: renamed from: v */
    private final int f30526v;

    /* JADX INFO: renamed from: w */
    private final int f30527w;

    public idu(Context context, View view, idv idvVar) {
        super(context);
        this.f30508c = hzj.PHONE_LAYOUT;
        this.f30510e = new hdf(this, 7);
        this.f30513h = ilk.PORTRAIT;
        this.f30518n = context;
        this.f30519o = new Handler(context.getMainLooper());
        this.f30506a = view;
        this.f30507b = idvVar;
        this.f30511f = context.getResources().getDimensionPixelSize(C0100R.dimen.menu_background_radius);
        this.f30512g = context.getResources().getDimensionPixelSize(C0100R.dimen.menu_arrow_base);
        this.f30524t = context.getResources().getDimensionPixelSize(C0100R.dimen.menu_arrow_height);
        this.f30523s = context.getResources().getDimensionPixelSize(C0100R.dimen.menu_horizontal_margin);
        this.f30527w = context.getResources().getDimensionPixelSize(C0100R.dimen.menu_max_height);
        this.f30525u = 80;
        this.f30526v = 5;
    }

    /* JADX INFO: renamed from: h */
    public static final int m11130h(View view, boolean z) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return z ? iArr[0] : iArr[1];
    }

    /* JADX INFO: renamed from: i */
    private final int m11131i() {
        int measuredWidth;
        if (this.f30508c.equals(hzj.f30014d)) {
            return (-getWidth()) - this.f30516k;
        }
        ilk ilkVar = ilk.PORTRAIT;
        switch (this.f30513h) {
            case PORTRAIT:
            case REVERSE_PORTRAIT:
                measuredWidth = this.f30526v != 3 ? (this.f30506a.getMeasuredWidth() - getWidth()) - this.f30523s : this.f30523s;
                break;
            case LANDSCAPE:
                measuredWidth = this.f30525u != 48 ? (-getWidth()) - this.f30516k : this.f30506a.getMeasuredHeight() + this.f30516k;
                break;
            case REVERSE_LANDSCAPE:
                measuredWidth = this.f30525u != 48 ? this.f30516k : ((-this.f30506a.getMeasuredHeight()) - getWidth()) - this.f30516k;
                break;
            default:
                throw new AssertionError("Unexpected orientation: ".concat(String.valueOf(String.valueOf(this.f30513h))));
        }
        int iRound = Math.round(this.f30506a.getRotation());
        int measuredHeight = 0;
        if (this.f30513h == ilk.REVERSE_LANDSCAPE && (iRound == -90 || iRound == 270)) {
            measuredHeight = this.f30506a.getMeasuredHeight();
        }
        return measuredWidth + measuredHeight;
    }

    /* JADX INFO: renamed from: j */
    private final int m11132j() {
        int measuredHeight;
        if (this.f30508c.equals(hzj.f30014d)) {
            return (getHeight() / 2) + this.f30506a.getMeasuredHeight();
        }
        ilk ilkVar = ilk.PORTRAIT;
        switch (this.f30513h) {
            case PORTRAIT:
            case REVERSE_PORTRAIT:
                measuredHeight = this.f30525u != 48 ? (-getHeight()) - this.f30516k : this.f30506a.getMeasuredHeight() + this.f30516k;
                break;
            case LANDSCAPE:
                measuredHeight = this.f30526v != 3 ? (-this.f30506a.getMeasuredWidth()) + this.f30523s : -this.f30523s;
                break;
            case REVERSE_LANDSCAPE:
                measuredHeight = this.f30526v != 3 ? (this.f30506a.getMeasuredWidth() - getHeight()) - this.f30523s : this.f30523s;
                break;
            default:
                throw new AssertionError("Unexpected orientation: ".concat(String.valueOf(String.valueOf(this.f30513h))));
        }
        int iRound = Math.round(this.f30506a.getRotation());
        int measuredWidth = 0;
        if (this.f30513h == ilk.LANDSCAPE && (iRound == 90 || iRound == -270)) {
            measuredWidth = this.f30506a.getMeasuredWidth();
        }
        return measuredHeight + measuredWidth;
    }

    /* JADX INFO: renamed from: k */
    private final void m11133k() {
        getContentView().setSystemUiVisibility(((Activity) this.f30518n).getWindow().getDecorView().getSystemUiVisibility());
    }

    /* JADX INFO: renamed from: l */
    private final void m11134l(ids idsVar) {
        View contentView = getContentView();
        for (ids idsVar2 : ids.values()) {
            View viewFindViewById = contentView.findViewById(idsVar2.f30502e);
            if (idsVar2 == idsVar && viewFindViewById.getVisibility() != 0) {
                viewFindViewById.setVisibility(0);
            } else if (idsVar2 != idsVar && viewFindViewById.getVisibility() != 8) {
                viewFindViewById.setVisibility(8);
            }
        }
        boolean z = idsVar.f30503f;
        int i = z ? 0 : this.f30524t;
        int i2 = z ? this.f30524t : 0;
        setWidth(this.f30514i + i);
        setHeight(Math.min(this.f30515j, Math.min(this.f30518n.getResources().getDisplayMetrics().heightPixels, this.f30527w) - this.f30524t) + i2);
        contentView.addOnLayoutChangeListener(this.f30510e);
    }

    /* JADX INFO: renamed from: a */
    public final ids m11135a() {
        if (this.f30508c.equals(hzj.f30014d)) {
            return ids.RIGHT;
        }
        ilk ilkVar = ilk.PORTRAIT;
        switch (this.f30513h) {
            case PORTRAIT:
            case REVERSE_PORTRAIT:
                return this.f30525u == 48 ? ids.TOP : ids.BOTTOM;
            case LANDSCAPE:
                return this.f30525u == 48 ? ids.LEFT : ids.RIGHT;
            case REVERSE_LANDSCAPE:
                return this.f30525u == 48 ? ids.RIGHT : ids.LEFT;
            default:
                throw new AssertionError("Unexpected orientation: ".concat(String.valueOf(String.valueOf(this.f30513h))));
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m11136b(Object obj) {
        this.f30522r.setItemChecked(this.f30507b.m11142a(obj), true);
        idv idvVar = this.f30507b;
        idvVar.f30529b = obj;
        jvd.m13538a();
        idvVar.notifyDataSetChanged();
        idt idtVar = this.f30509d;
        if (idtVar != null) {
            idtVar.mo10984a(obj);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: c */
    public final void m11137c(int i) {
        int dimensionPixelSize = this.f30518n.getResources().getDimensionPixelSize(C0100R.dimen.menu_width);
        this.f30514i = dimensionPixelSize;
        setWidth(dimensionPixelSize);
        setBackgroundDrawable(new ColorDrawable(0));
        setOutsideTouchable(true);
        setFocusable(true);
        setAttachedInDecor(false);
        setClippingEnabled(false);
        setOverlapAnchor(true);
        View view = null;
        View viewInflate = LayoutInflater.from(this.f30518n).inflate(C0100R.layout.popup_menu, (ViewGroup) null);
        setContentView(viewInflate);
        TextView textView = (TextView) viewInflate.findViewById(C0100R.id.popup_title);
        this.f30520p = textView;
        textView.setText(i);
        ImageButton imageButton = (ImageButton) viewInflate.findViewById(C0100R.id.popup_help_button);
        this.f30521q = imageButton;
        Context context = this.f30518n;
        imageButton.setContentDescription(context.getString(C0100R.string.menu_help_button_announce, context.getString(i)));
        viewInflate.measure(View.MeasureSpec.makeMeasureSpec(getWidth(), 1073741824), 0);
        int measuredHeight = viewInflate.getMeasuredHeight();
        ListView listView = (ListView) viewInflate.findViewById(C0100R.id.popup_list);
        this.f30522r = listView;
        listView.setAdapter((ListAdapter) this.f30507b);
        this.f30522r.setOnItemClickListener(this);
        int listPaddingTop = this.f30522r.getListPaddingTop() + this.f30522r.getListPaddingBottom();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getWidth() - (getContentView().getPaddingLeft() + getContentView().getPaddingRight()), 1073741824);
        int maxAvailableHeight = getMaxAvailableHeight(this.f30506a);
        for (int i2 = 0; i2 < this.f30507b.getCount(); i2++) {
            view = this.f30507b.getView(i2, view, this.f30522r);
            AbsListView.LayoutParams layoutParams = (AbsListView.LayoutParams) view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new AbsListView.LayoutParams(-1, -2, 0);
                view.setLayoutParams(layoutParams);
            }
            view.measure(ViewGroup.getChildMeasureSpec(iMakeMeasureSpec, this.f30522r.getListPaddingLeft() + this.f30522r.getListPaddingRight(), layoutParams.width), layoutParams.height > 0 ? View.MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824) : View.MeasureSpec.makeMeasureSpec(maxAvailableHeight, 0));
            view.forceLayout();
            listPaddingTop += view.getMeasuredHeight();
        }
        this.f30515j = measuredHeight + listPaddingTop;
        m11136b(this.f30507b.f30529b);
    }

    /* JADX INFO: renamed from: d */
    public final void m11138d(View.OnClickListener onClickListener) {
        this.f30521q.setOnClickListener(onClickListener);
        if (onClickListener == null) {
            this.f30521q.setVisibility(8);
        } else {
            this.f30521q.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m11139e(Object obj) {
        if (obj == this.f30507b.f30529b) {
            return;
        }
        m11136b(obj);
    }

    /* JADX INFO: renamed from: f */
    public final void m11140f() {
        getContentView().addOnLayoutChangeListener(this.f30510e);
        m11134l(m11135a());
        showAsDropDown(this.f30506a, m11131i(), m11132j(), 0);
        m11133k();
        View contentView = getContentView();
        Context context = this.f30518n;
        idv idvVar = this.f30507b;
        contentView.announceForAccessibility(context.getString(C0100R.string.menu_open_announce, this.f30520p.getText(), ((idw) idvVar.f30528a.get(idvVar.m11142a(idvVar.f30529b))).f30531b));
        getWidth();
        getHeight();
        update();
    }

    /* JADX INFO: renamed from: g */
    public final void m11141g(ilk ilkVar) {
        this.f30513h = ilkVar;
        if (isShowing()) {
            m11134l(m11135a());
            update(this.f30506a, m11131i(), m11132j(), -1, -1);
            m11133k();
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        idw idwVarM11143b = this.f30507b.getItem(i);
        AmbientModeSupport.AmbientController ambientController = this.f30517l;
        if (ambientController != null) {
            Object obj = ambientController.f1702a;
            if (idwVarM11143b.f30530a == gyx.MARS_STORE && !idwVarM11143b.f30535f) {
                ((iak) obj).m10991h();
            }
        }
        if (idwVarM11143b.f30535f) {
            m11139e(idwVarM11143b.f30530a);
            npk.m17603e(this.f30518n);
            view.announceForAccessibility(this.f30518n.getResources().getString(C0100R.string.menu_selected_accessibility_announce, idwVarM11143b.f30531b));
            this.f30519o.postDelayed(new idd(this, 3), f30505m.toMillis());
        }
    }
}
