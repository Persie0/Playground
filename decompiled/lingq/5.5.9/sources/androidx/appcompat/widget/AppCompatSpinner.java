package androidx.appcompat.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.DialogInterfaceC0215b;
import java.util.WeakHashMap;
import p058d.C4999a;
import p104f.C5452a;
import p164i.C6102c;
import p446w2.C9804b;
import p471x2.C10029b0;
import p471x2.C10049l0;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatSpinner extends Spinner {

    /* JADX INFO: renamed from: i */
    @SuppressLint({"ResourceType"})
    public static final int[] f900i = {R.attr.spinnerMode};

    /* JADX INFO: renamed from: a */
    public final C0304d f901a;

    /* JADX INFO: renamed from: b */
    public final Context f902b;

    /* JADX INFO: renamed from: c */
    public final C0346v f903c;

    /* JADX INFO: renamed from: d */
    public SpinnerAdapter f904d;

    /* JADX INFO: renamed from: e */
    public final boolean f905e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC0259h f906f;

    /* JADX INFO: renamed from: g */
    public int f907g;

    /* JADX INFO: renamed from: h */
    public final Rect f908h;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0251a();

        /* JADX INFO: renamed from: a */
        public boolean f909a;

        /* JADX INFO: renamed from: androidx.appcompat.widget.AppCompatSpinner$SavedState$a */
        public class C0251a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f909a = parcel.readByte() != 0;
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeByte(this.f909a ? (byte) 1 : (byte) 0);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.AppCompatSpinner$a */
    public class ViewTreeObserverOnGlobalLayoutListenerC0252a implements ViewTreeObserver.OnGlobalLayoutListener {
        public ViewTreeObserverOnGlobalLayoutListenerC0252a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            if (!appCompatSpinner.getInternalPopup().mo998a()) {
                appCompatSpinner.f906f.mo1007n(C0254c.m994b(appCompatSpinner), C0254c.m993a(appCompatSpinner));
            }
            ViewTreeObserver viewTreeObserver = appCompatSpinner.getViewTreeObserver();
            if (viewTreeObserver != null) {
                C0253b.m992a(viewTreeObserver, this);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.AppCompatSpinner$b */
    public static final class C0253b {
        /* JADX INFO: renamed from: a */
        public static void m992a(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.AppCompatSpinner$c */
    public static final class C0254c {
        /* JADX INFO: renamed from: a */
        public static int m993a(View view) {
            return view.getTextAlignment();
        }

        /* JADX INFO: renamed from: b */
        public static int m994b(View view) {
            return view.getTextDirection();
        }

        /* JADX INFO: renamed from: c */
        public static void m995c(View view, int i10) {
            view.setTextAlignment(i10);
        }

        /* JADX INFO: renamed from: d */
        public static void m996d(View view, int i10) {
            view.setTextDirection(i10);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.AppCompatSpinner$d */
    public static final class C0255d {
        /* JADX INFO: renamed from: a */
        public static void m997a(ThemedSpinnerAdapter themedSpinnerAdapter, Resources.Theme theme) {
            if (C9804b.m18286a(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
                return;
            }
            themedSpinnerAdapter.setDropDownViewTheme(theme);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.AppCompatSpinner$e */
    public class DialogInterfaceOnClickListenerC0256e implements InterfaceC0259h, DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a */
        public DialogInterfaceC0215b f911a;

        /* JADX INFO: renamed from: b */
        public ListAdapter f912b;

        /* JADX INFO: renamed from: c */
        public CharSequence f913c;

        public DialogInterfaceOnClickListenerC0256e() {
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0259h
        /* JADX INFO: renamed from: a */
        public final boolean mo998a() {
            DialogInterfaceC0215b dialogInterfaceC0215b = this.f911a;
            if (dialogInterfaceC0215b != null) {
                return dialogInterfaceC0215b.isShowing();
            }
            return false;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0259h
        /* JADX INFO: renamed from: c */
        public final int mo999c() {
            return 0;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0259h
        public final void dismiss() {
            DialogInterfaceC0215b dialogInterfaceC0215b = this.f911a;
            if (dialogInterfaceC0215b != null) {
                dialogInterfaceC0215b.dismiss();
                this.f911a = null;
            }
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0259h
        /* JADX INFO: renamed from: e */
        public final void mo1000e(int i10) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0259h
        /* JADX INFO: renamed from: f */
        public final CharSequence mo1001f() {
            return this.f913c;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0259h
        /* JADX INFO: renamed from: h */
        public final Drawable mo1002h() {
            return null;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0259h
        /* JADX INFO: renamed from: i */
        public final void mo1003i(CharSequence charSequence) {
            this.f913c = charSequence;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0259h
        /* JADX INFO: renamed from: k */
        public final void mo1004k(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0259h
        /* JADX INFO: renamed from: l */
        public final void mo1005l(int i10) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0259h
        /* JADX INFO: renamed from: m */
        public final void mo1006m(int i10) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0259h
        /* JADX INFO: renamed from: n */
        public final void mo1007n(int i10, int i11) {
            if (this.f912b == null) {
                return;
            }
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            DialogInterfaceC0215b.a aVar = new DialogInterfaceC0215b.a(appCompatSpinner.getPopupContext());
            CharSequence charSequence = this.f913c;
            if (charSequence != null) {
                aVar.setTitle(charSequence);
            }
            ListAdapter listAdapter = this.f912b;
            int selectedItemPosition = appCompatSpinner.getSelectedItemPosition();
            AlertController.C0211b c0211b = aVar.f599a;
            c0211b.f590q = listAdapter;
            c0211b.f591r = this;
            c0211b.f594u = selectedItemPosition;
            c0211b.f593t = true;
            DialogInterfaceC0215b dialogInterfaceC0215bCreate = aVar.create();
            this.f911a = dialogInterfaceC0215bCreate;
            AlertController.RecycleListView recycleListView = dialogInterfaceC0215bCreate.f598f.f551g;
            C0254c.m996d(recycleListView, i10);
            C0254c.m995c(recycleListView, i11);
            this.f911a.show();
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0259h
        /* JADX INFO: renamed from: o */
        public final int mo1008o() {
            return 0;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            appCompatSpinner.setSelection(i10);
            if (appCompatSpinner.getOnItemClickListener() != null) {
                appCompatSpinner.performItemClick(null, i10, this.f912b.getItemId(i10));
            }
            dismiss();
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0259h
        /* JADX INFO: renamed from: p */
        public final void mo1009p(ListAdapter listAdapter) {
            this.f912b = listAdapter;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.AppCompatSpinner$f */
    public static class C0257f implements ListAdapter, SpinnerAdapter {

        /* JADX INFO: renamed from: a */
        public final SpinnerAdapter f915a;

        /* JADX INFO: renamed from: b */
        public final ListAdapter f916b;

        public C0257f(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f915a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f916b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null) {
                if (spinnerAdapter instanceof ThemedSpinnerAdapter) {
                    C0255d.m997a((ThemedSpinnerAdapter) spinnerAdapter, theme);
                } else if (spinnerAdapter instanceof InterfaceC0351x0) {
                    InterfaceC0351x0 interfaceC0351x0 = (InterfaceC0351x0) spinnerAdapter;
                    if (interfaceC0351x0.getDropDownViewTheme() == null) {
                        interfaceC0351x0.m1308a();
                    }
                }
            }
        }

        @Override // android.widget.ListAdapter
        public final boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f916b;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            SpinnerAdapter spinnerAdapter = this.f915a;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public final View getDropDownView(int i10, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f915a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i10, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public final Object getItem(int i10) {
            SpinnerAdapter spinnerAdapter = this.f915a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i10);
        }

        @Override // android.widget.Adapter
        public final long getItemId(int i10) {
            SpinnerAdapter spinnerAdapter = this.f915a;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i10);
        }

        @Override // android.widget.Adapter
        public final int getItemViewType(int i10) {
            return 0;
        }

        @Override // android.widget.Adapter
        public final View getView(int i10, View view, ViewGroup viewGroup) {
            return getDropDownView(i10, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public final int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public final boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f915a;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public final boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public final boolean isEnabled(int i10) {
            ListAdapter listAdapter = this.f916b;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i10);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f915a;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f915a;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.AppCompatSpinner$g */
    public class C0258g extends C0327l0 implements InterfaceC0259h {

        /* JADX INFO: renamed from: X */
        public CharSequence f917X;

        /* JADX INFO: renamed from: Y */
        public ListAdapter f918Y;

        /* JADX INFO: renamed from: Z */
        public final Rect f919Z;

        /* JADX INFO: renamed from: a0 */
        public int f920a0;

        /* JADX INFO: renamed from: androidx.appcompat.widget.AppCompatSpinner$g$a */
        public class a implements AdapterView.OnItemClickListener {
            public a() {
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
                C0258g c0258g = C0258g.this;
                AppCompatSpinner.this.setSelection(i10);
                if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                    AppCompatSpinner.this.performItemClick(view, i10, c0258g.f918Y.getItemId(i10));
                }
                c0258g.dismiss();
            }
        }

        /* JADX INFO: renamed from: androidx.appcompat.widget.AppCompatSpinner$g$b */
        public class b implements ViewTreeObserver.OnGlobalLayoutListener {
            public b() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                C0258g c0258g = C0258g.this;
                AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
                c0258g.getClass();
                WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
                if (!(C10029b0.g.m18698b(appCompatSpinner) && appCompatSpinner.getGlobalVisibleRect(c0258g.f919Z))) {
                    c0258g.dismiss();
                } else {
                    c0258g.m1010s();
                    c0258g.mo894b();
                }
            }
        }

        /* JADX INFO: renamed from: androidx.appcompat.widget.AppCompatSpinner$g$c */
        public class c implements PopupWindow.OnDismissListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f924a;

            public c(b bVar) {
                this.f924a = bVar;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f924a);
                }
            }
        }

        public C0258g(Context context, AttributeSet attributeSet, int i10) {
            super(context, attributeSet, i10, 0);
            this.f919Z = new Rect();
            this.f1265J = AppCompatSpinner.this;
            this.f1275T = true;
            this.f1276U.setFocusable(true);
            this.f1266K = new a();
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0259h
        /* JADX INFO: renamed from: f */
        public final CharSequence mo1001f() {
            return this.f917X;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0259h
        /* JADX INFO: renamed from: i */
        public final void mo1003i(CharSequence charSequence) {
            this.f917X = charSequence;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0259h
        /* JADX INFO: renamed from: m */
        public final void mo1006m(int i10) {
            this.f920a0 = i10;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0259h
        /* JADX INFO: renamed from: n */
        public final void mo1007n(int i10, int i11) {
            boolean zMo893a = mo893a();
            m1010s();
            C0332o c0332o = this.f1276U;
            c0332o.setInputMethodMode(2);
            mo894b();
            C0314g0 c0314g0 = this.f1279c;
            c0314g0.setChoiceMode(1);
            C0254c.m996d(c0314g0, i10);
            C0254c.m995c(c0314g0, i11);
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            int selectedItemPosition = appCompatSpinner.getSelectedItemPosition();
            C0314g0 c0314g1 = this.f1279c;
            if (mo893a() && c0314g1 != null) {
                c0314g1.setListSelectionHidden(false);
                c0314g1.setSelection(selectedItemPosition);
                if (c0314g1.getChoiceMode() != 0) {
                    c0314g1.setItemChecked(selectedItemPosition, true);
                }
            }
            if (zMo893a) {
                return;
            }
            ViewTreeObserver viewTreeObserver = appCompatSpinner.getViewTreeObserver();
            if (viewTreeObserver != null) {
                b bVar = new b();
                viewTreeObserver.addOnGlobalLayoutListener(bVar);
                c0332o.setOnDismissListener(new c(bVar));
            }
        }

        @Override // androidx.appcompat.widget.C0327l0, androidx.appcompat.widget.AppCompatSpinner.InterfaceC0259h
        /* JADX INFO: renamed from: p */
        public final void mo1009p(ListAdapter listAdapter) {
            super.mo1009p(listAdapter);
            this.f918Y = listAdapter;
        }

        /* JADX INFO: renamed from: s */
        public final void m1010s() {
            int i10;
            Drawable drawableM1238h = m1238h();
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            if (drawableM1238h != null) {
                drawableM1238h.getPadding(appCompatSpinner.f908h);
                i10 = C0318h1.m1200a(appCompatSpinner) ? appCompatSpinner.f908h.right : -appCompatSpinner.f908h.left;
            } else {
                Rect rect = appCompatSpinner.f908h;
                rect.right = 0;
                rect.left = 0;
                i10 = 0;
            }
            int paddingLeft = appCompatSpinner.getPaddingLeft();
            int paddingRight = appCompatSpinner.getPaddingRight();
            int width = appCompatSpinner.getWidth();
            int i11 = appCompatSpinner.f907g;
            if (i11 == -2) {
                int iM991a = appCompatSpinner.m991a((SpinnerAdapter) this.f918Y, m1238h());
                int i12 = appCompatSpinner.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = appCompatSpinner.f908h;
                int i13 = (i12 - rect2.left) - rect2.right;
                if (iM991a > i13) {
                    iM991a = i13;
                }
                m1243r(Math.max(iM991a, (width - paddingLeft) - paddingRight));
            } else if (i11 == -1) {
                m1243r((width - paddingLeft) - paddingRight);
            } else {
                m1243r(i11);
            }
            this.f1282f = C0318h1.m1200a(appCompatSpinner) ? (((width - paddingRight) - this.f1281e) - this.f920a0) + i10 : paddingLeft + this.f920a0 + i10;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.AppCompatSpinner$h */
    public interface InterfaceC0259h {
        /* JADX INFO: renamed from: a */
        boolean mo998a();

        /* JADX INFO: renamed from: c */
        int mo999c();

        void dismiss();

        /* JADX INFO: renamed from: e */
        void mo1000e(int i10);

        /* JADX INFO: renamed from: f */
        CharSequence mo1001f();

        /* JADX INFO: renamed from: h */
        Drawable mo1002h();

        /* JADX INFO: renamed from: i */
        void mo1003i(CharSequence charSequence);

        /* JADX INFO: renamed from: k */
        void mo1004k(Drawable drawable);

        /* JADX INFO: renamed from: l */
        void mo1005l(int i10);

        /* JADX INFO: renamed from: m */
        void mo1006m(int i10);

        /* JADX INFO: renamed from: n */
        void mo1007n(int i10, int i11);

        /* JADX INFO: renamed from: o */
        int mo1008o();

        /* JADX INFO: renamed from: p */
        void mo1009p(ListAdapter listAdapter);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.linguist.R.attr.spinnerStyle);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0072  */
    /* JADX WARN: Code duplicated, block: B:28:0x0076  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:32:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:39:0x00f9  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i10) throws Throwable {
        Exception e10;
        TypedArray typedArrayObtainStyledAttributes;
        CharSequence[] textArray;
        SpinnerAdapter spinnerAdapter;
        super(context, attributeSet, i10);
        this.f908h = new Rect();
        C0349w0.m1279a(getContext(), this);
        int[] iArr = C4999a.f32608v;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        this.f901a = new C0304d(this);
        int resourceId = typedArrayObtainStyledAttributes2.getResourceId(4, 0);
        if (resourceId != 0) {
            this.f902b = new C6102c(context, resourceId);
        } else {
            this.f902b = context;
        }
        int i11 = -1;
        TypedArray typedArray = null;
        try {
            try {
                typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f900i, i10, 0);
                try {
                    if (typedArrayObtainStyledAttributes.hasValue(0)) {
                        i11 = typedArrayObtainStyledAttributes.getInt(0, 0);
                    }
                } catch (Exception e11) {
                    e10 = e11;
                    Log.i("AppCompatSpinner", "Could not read android:spinnerMode", e10);
                    if (typedArrayObtainStyledAttributes != null) {
                    }
                    if (i11 != 0) {
                        DialogInterfaceOnClickListenerC0256e dialogInterfaceOnClickListenerC0256e = new DialogInterfaceOnClickListenerC0256e();
                        this.f906f = dialogInterfaceOnClickListenerC0256e;
                        dialogInterfaceOnClickListenerC0256e.f913c = typedArrayObtainStyledAttributes2.getString(2);
                    } else if (i11 == 1) {
                        C0258g c0258g = new C0258g(this.f902b, attributeSet, i10);
                        C0300b1 c0300b1M1111m = C0300b1.m1111m(this.f902b, attributeSet, iArr, i10);
                        this.f907g = c0300b1M1111m.f1134b.getLayoutDimension(3, -2);
                        c0258g.m1239k(c0300b1M1111m.m1116e(1));
                        c0258g.f917X = typedArrayObtainStyledAttributes2.getString(2);
                        c0300b1M1111m.m1124n();
                        this.f906f = c0258g;
                        this.f903c = new C0346v(this, this, c0258g);
                    }
                    textArray = typedArrayObtainStyledAttributes2.getTextArray(0);
                    if (textArray != null) {
                        ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
                        arrayAdapter.setDropDownViewResource(com.linguist.R.layout.support_simple_spinner_dropdown_item);
                        setAdapter((SpinnerAdapter) arrayAdapter);
                    }
                    typedArrayObtainStyledAttributes2.recycle();
                    this.f905e = true;
                    spinnerAdapter = this.f904d;
                    if (spinnerAdapter != null) {
                        setAdapter(spinnerAdapter);
                        this.f904d = null;
                    }
                    this.f901a.m1128d(attributeSet, i10);
                }
            } catch (Throwable th2) {
                th = th2;
                typedArray = typedArrayObtainStyledAttributes;
                if (typedArray != null) {
                    typedArray.recycle();
                }
                throw th;
            }
        } catch (Exception e12) {
            e10 = e12;
            typedArrayObtainStyledAttributes = null;
        } catch (Throwable th3) {
            th = th3;
            if (typedArray != null) {
                typedArray.recycle();
            }
            throw th;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (i11 != 0) {
            DialogInterfaceOnClickListenerC0256e dialogInterfaceOnClickListenerC0256e2 = new DialogInterfaceOnClickListenerC0256e();
            this.f906f = dialogInterfaceOnClickListenerC0256e2;
            dialogInterfaceOnClickListenerC0256e2.f913c = typedArrayObtainStyledAttributes2.getString(2);
        } else if (i11 == 1) {
            C0258g c0258g2 = new C0258g(this.f902b, attributeSet, i10);
            C0300b1 c0300b1M1111m2 = C0300b1.m1111m(this.f902b, attributeSet, iArr, i10);
            this.f907g = c0300b1M1111m2.f1134b.getLayoutDimension(3, -2);
            c0258g2.m1239k(c0300b1M1111m2.m1116e(1));
            c0258g2.f917X = typedArrayObtainStyledAttributes2.getString(2);
            c0300b1M1111m2.m1124n();
            this.f906f = c0258g2;
            this.f903c = new C0346v(this, this, c0258g2);
        }
        textArray = typedArrayObtainStyledAttributes2.getTextArray(0);
        if (textArray != null) {
            ArrayAdapter arrayAdapter2 = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
            arrayAdapter2.setDropDownViewResource(com.linguist.R.layout.support_simple_spinner_dropdown_item);
            setAdapter((SpinnerAdapter) arrayAdapter2);
        }
        typedArrayObtainStyledAttributes2.recycle();
        this.f905e = true;
        spinnerAdapter = this.f904d;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.f904d = null;
        }
        this.f901a.m1128d(attributeSet, i10);
    }

    /* JADX INFO: renamed from: a */
    public final int m991a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i10 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i10) {
                view = null;
                i10 = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        Rect rect = this.f908h;
        drawable.getPadding(rect);
        return iMax2 + rect.left + rect.right;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0304d c0304d = this.f901a;
        if (c0304d != null) {
            c0304d.m1125a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        InterfaceC0259h interfaceC0259h = this.f906f;
        return interfaceC0259h != null ? interfaceC0259h.mo999c() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        InterfaceC0259h interfaceC0259h = this.f906f;
        return interfaceC0259h != null ? interfaceC0259h.mo1008o() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f906f != null ? this.f907g : super.getDropDownWidth();
    }

    public final InterfaceC0259h getInternalPopup() {
        return this.f906f;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        InterfaceC0259h interfaceC0259h = this.f906f;
        return interfaceC0259h != null ? interfaceC0259h.mo1002h() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f902b;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        InterfaceC0259h interfaceC0259h = this.f906f;
        return interfaceC0259h != null ? interfaceC0259h.mo1001f() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0304d c0304d = this.f901a;
        if (c0304d != null) {
            return c0304d.m1126b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0304d c0304d = this.f901a;
        if (c0304d != null) {
            return c0304d.m1127c();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC0259h interfaceC0259h = this.f906f;
        if (interfaceC0259h != null && interfaceC0259h.mo998a()) {
            interfaceC0259h.dismiss();
        }
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f906f != null && View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), m991a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i10)), getMeasuredHeight());
        }
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (savedState.f909a && (viewTreeObserver = getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC0252a());
        }
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        InterfaceC0259h interfaceC0259h = this.f906f;
        savedState.f909a = interfaceC0259h != null && interfaceC0259h.mo998a();
        return savedState;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C0346v c0346v = this.f903c;
        if (c0346v == null || !c0346v.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        InterfaceC0259h interfaceC0259h = this.f906f;
        if (interfaceC0259h == null) {
            return super.performClick();
        }
        if (!interfaceC0259h.mo998a()) {
            interfaceC0259h.mo1007n(C0254c.m994b(this), C0254c.m993a(this));
        }
        return true;
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f905e) {
            this.f904d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        InterfaceC0259h interfaceC0259h = this.f906f;
        if (interfaceC0259h != null) {
            Context context = this.f902b;
            if (context == null) {
                context = getContext();
            }
            interfaceC0259h.mo1009p(new C0257f(spinnerAdapter, context.getTheme()));
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0304d c0304d = this.f901a;
        if (c0304d != null) {
            c0304d.m1129e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C0304d c0304d = this.f901a;
        if (c0304d != null) {
            c0304d.m1130f(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i10) {
        InterfaceC0259h interfaceC0259h = this.f906f;
        if (interfaceC0259h == null) {
            super.setDropDownHorizontalOffset(i10);
        } else {
            interfaceC0259h.mo1006m(i10);
            interfaceC0259h.mo1000e(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i10) {
        InterfaceC0259h interfaceC0259h = this.f906f;
        if (interfaceC0259h != null) {
            interfaceC0259h.mo1005l(i10);
        } else {
            super.setDropDownVerticalOffset(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i10) {
        if (this.f906f != null) {
            this.f907g = i10;
        } else {
            super.setDropDownWidth(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        InterfaceC0259h interfaceC0259h = this.f906f;
        if (interfaceC0259h != null) {
            interfaceC0259h.mo1004k(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i10) {
        setPopupBackgroundDrawable(C5452a.m11672a(getPopupContext(), i10));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        InterfaceC0259h interfaceC0259h = this.f906f;
        if (interfaceC0259h != null) {
            interfaceC0259h.mo1003i(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0304d c0304d = this.f901a;
        if (c0304d != null) {
            c0304d.m1132h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0304d c0304d = this.f901a;
        if (c0304d != null) {
            c0304d.m1133i(mode);
        }
    }
}
