package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.C0166e;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.customview.view.AbsSavedState;
import com.linguist.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p039c3.AbstractC1673a;
import p058d.C4999a;
import p164i.InterfaceC6101b;
import p471x2.C10029b0;

/* JADX INFO: loaded from: classes.dex */
public class SearchView extends C0323j0 implements InterfaceC6101b {

    /* JADX INFO: renamed from: B0 */
    public static final C0280o f946B0;

    /* JADX INFO: renamed from: A0 */
    public final WeakHashMap<String, Drawable.ConstantState> f947A0;

    /* JADX INFO: renamed from: K */
    public final SearchAutoComplete f948K;

    /* JADX INFO: renamed from: L */
    public final View f949L;

    /* JADX INFO: renamed from: M */
    public final View f950M;

    /* JADX INFO: renamed from: N */
    public final View f951N;

    /* JADX INFO: renamed from: O */
    public final ImageView f952O;

    /* JADX INFO: renamed from: P */
    public final ImageView f953P;

    /* JADX INFO: renamed from: Q */
    public final ImageView f954Q;

    /* JADX INFO: renamed from: R */
    public final ImageView f955R;

    /* JADX INFO: renamed from: S */
    public final View f956S;

    /* JADX INFO: renamed from: T */
    public C0281p f957T;

    /* JADX INFO: renamed from: U */
    public final Rect f958U;

    /* JADX INFO: renamed from: V */
    public final Rect f959V;

    /* JADX INFO: renamed from: W */
    public final int[] f960W;

    /* JADX INFO: renamed from: a0 */
    public final int[] f961a0;

    /* JADX INFO: renamed from: b0 */
    public final ImageView f962b0;

    /* JADX INFO: renamed from: c0 */
    public final Drawable f963c0;

    /* JADX INFO: renamed from: d0 */
    public final int f964d0;

    /* JADX INFO: renamed from: e0 */
    public final int f965e0;

    /* JADX INFO: renamed from: f0 */
    public final Intent f966f0;

    /* JADX INFO: renamed from: g0 */
    public final Intent f967g0;

    /* JADX INFO: renamed from: h0 */
    public final CharSequence f968h0;

    /* JADX INFO: renamed from: i0 */
    public View.OnFocusChangeListener f969i0;

    /* JADX INFO: renamed from: j0 */
    public View.OnClickListener f970j0;

    /* JADX INFO: renamed from: k0 */
    public boolean f971k0;

    /* JADX INFO: renamed from: l0 */
    public boolean f972l0;

    /* JADX INFO: renamed from: m0 */
    public AbstractC1673a f973m0;

    /* JADX INFO: renamed from: n0 */
    public boolean f974n0;

    /* JADX INFO: renamed from: o0 */
    public CharSequence f975o0;

    /* JADX INFO: renamed from: p0 */
    public boolean f976p0;

    /* JADX INFO: renamed from: q0 */
    public boolean f977q0;

    /* JADX INFO: renamed from: r0 */
    public int f978r0;

    /* JADX INFO: renamed from: s0 */
    public boolean f979s0;

    /* JADX INFO: renamed from: t0 */
    public CharSequence f980t0;

    /* JADX INFO: renamed from: u0 */
    public boolean f981u0;

    /* JADX INFO: renamed from: v0 */
    public int f982v0;

    /* JADX INFO: renamed from: w0 */
    public SearchableInfo f983w0;

    /* JADX INFO: renamed from: x0 */
    public Bundle f984x0;

    /* JADX INFO: renamed from: y0 */
    public final RunnableC0267b f985y0;

    /* JADX INFO: renamed from: z0 */
    public final RunnableC0268c f986z0;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0264a();

        /* JADX INFO: renamed from: c */
        public boolean f987c;

        /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$SavedState$a */
        public class C0264a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f987c = ((Boolean) parcel.readValue(null)).booleanValue();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SearchView.SavedState{");
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append(" isIconified=");
            return C0166e.m769p(sb2, this.f987c, "}");
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f5635a, i10);
            parcel.writeValue(Boolean.valueOf(this.f987c));
        }
    }

    public static class SearchAutoComplete extends C0301c {

        /* JADX INFO: renamed from: e */
        public int f988e;

        /* JADX INFO: renamed from: f */
        public SearchView f989f;

        /* JADX INFO: renamed from: g */
        public boolean f990g;

        /* JADX INFO: renamed from: h */
        public final RunnableC0265a f991h;

        /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$SearchAutoComplete$a */
        public class RunnableC0265a implements Runnable {
            public RunnableC0265a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                SearchAutoComplete searchAutoComplete = SearchAutoComplete.this;
                if (searchAutoComplete.f990g) {
                    ((InputMethodManager) searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchAutoComplete, 0);
                    searchAutoComplete.f990g = false;
                }
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            super(context, attributeSet, 0);
            this.f991h = new RunnableC0265a();
            this.f988e = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i10 = configuration.screenWidthDp;
            int i11 = configuration.screenHeightDp;
            if (i10 < 960 || i11 < 720 || configuration.orientation != 2) {
                return (i10 >= 600 || (i10 >= 640 && i11 >= 480)) ? 192 : 160;
            }
            return 256;
        }

        /* JADX INFO: renamed from: a */
        public final void m1037a() {
            if (Build.VERSION.SDK_INT >= 29) {
                C0276k.m1039b(this, 1);
                if (enoughToFilter()) {
                    showDropDown();
                }
            } else {
                C0280o c0280o = SearchView.f946B0;
                c0280o.getClass();
                C0280o.m1040a();
                Method method = c0280o.f1005c;
                if (method != null) {
                    try {
                        method.invoke(this, Boolean.TRUE);
                    } catch (Exception unused) {
                    }
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final boolean enoughToFilter() {
            if (this.f988e > 0 && !super.enoughToFilter()) {
                return false;
            }
            return true;
        }

        @Override // androidx.appcompat.widget.C0301c, android.widget.TextView, android.view.View
        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f990g) {
                RunnableC0265a runnableC0265a = this.f991h;
                removeCallbacks(runnableC0265a);
                post(runnableC0265a);
            }
            return inputConnectionOnCreateInputConnection;
        }

        @Override // android.view.View
        public final void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onFocusChanged(boolean z10, int i10, Rect rect) {
            super.onFocusChanged(z10, i10, rect);
            SearchView searchView = this.f989f;
            searchView.m1036y(searchView.f972l0);
            searchView.post(searchView.f985y0);
            if (searchView.f948K.hasFocus()) {
                searchView.m1025n();
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final boolean onKeyPreIme(int i10, KeyEvent keyEvent) {
            if (i10 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f989f.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i10, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onWindowFocusChanged(boolean z10) {
            super.onWindowFocusChanged(z10);
            if (z10 && this.f989f.hasFocus() && getVisibility() == 0) {
                boolean z11 = true;
                this.f990g = true;
                Context context = getContext();
                C0280o c0280o = SearchView.f946B0;
                if (context.getResources().getConfiguration().orientation != 2) {
                    z11 = false;
                }
                if (z11) {
                    m1037a();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public final void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z10) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            RunnableC0265a runnableC0265a = this.f991h;
            if (!z10) {
                this.f990g = false;
                removeCallbacks(runnableC0265a);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f990g = true;
                    return;
                }
                this.f990g = false;
                removeCallbacks(runnableC0265a);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f989f = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i10) {
            super.setThreshold(i10);
            this.f988e = i10;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$a */
    public class C0266a implements TextWatcher {
        public C0266a() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            SearchView searchView = SearchView.this;
            Editable text = searchView.f948K.getText();
            searchView.f980t0 = text;
            boolean z10 = !TextUtils.isEmpty(text);
            searchView.m1035x(z10);
            boolean z11 = !z10;
            int i13 = 8;
            if (searchView.f979s0 && !searchView.f972l0 && z11) {
                searchView.f953P.setVisibility(8);
                i13 = 0;
            }
            searchView.f955R.setVisibility(i13);
            searchView.m1031t();
            searchView.m1034w();
            charSequence.toString();
            searchView.getClass();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$b */
    public class RunnableC0267b implements Runnable {
        public RunnableC0267b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            SearchView.this.m1032u();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$c */
    public class RunnableC0268c implements Runnable {
        public RunnableC0268c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            AbstractC1673a abstractC1673a = SearchView.this.f973m0;
            if (abstractC1673a instanceof ViewOnClickListenerC0347v0) {
                abstractC1673a.mo1272c(null);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$d */
    public class ViewOnFocusChangeListenerC0269d implements View.OnFocusChangeListener {
        public ViewOnFocusChangeListenerC0269d() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public final void onFocusChange(View view, boolean z10) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.f969i0;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z10);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$e */
    public class ViewOnLayoutChangeListenerC0270e implements View.OnLayoutChangeListener {
        public ViewOnLayoutChangeListenerC0270e() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            int dimensionPixelSize;
            SearchView searchView = SearchView.this;
            View view2 = searchView.f956S;
            if (view2.getWidth() > 1) {
                Resources resources = searchView.getContext().getResources();
                int paddingLeft = searchView.f950M.getPaddingLeft();
                Rect rect = new Rect();
                boolean zM1200a = C0318h1.m1200a(searchView);
                if (searchView.f971k0) {
                    dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_text_padding_left) + resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width);
                } else {
                    dimensionPixelSize = 0;
                }
                SearchAutoComplete searchAutoComplete = searchView.f948K;
                searchAutoComplete.getDropDownBackground().getPadding(rect);
                searchAutoComplete.setDropDownHorizontalOffset(zM1200a ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
                searchAutoComplete.setDropDownWidth((((view2.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$f */
    public class ViewOnClickListenerC0271f implements View.OnClickListener {
        public ViewOnClickListenerC0271f() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            SearchView searchView = SearchView.this;
            ImageView imageView = searchView.f952O;
            SearchAutoComplete searchAutoComplete = searchView.f948K;
            if (view == imageView) {
                searchView.m1036y(false);
                searchAutoComplete.requestFocus();
                searchAutoComplete.setImeVisibility(true);
                View.OnClickListener onClickListener = searchView.f970j0;
                if (onClickListener != null) {
                    onClickListener.onClick(searchView);
                    return;
                }
                return;
            }
            if (view == searchView.f954Q) {
                searchView.m1026o();
                return;
            }
            if (view == searchView.f953P) {
                searchView.m1030s();
                return;
            }
            if (view != searchView.f955R) {
                if (view == searchAutoComplete) {
                    searchView.m1025n();
                    return;
                }
                return;
            }
            SearchableInfo searchableInfo = searchView.f983w0;
            if (searchableInfo == null) {
                return;
            }
            try {
                if (!searchableInfo.getVoiceSearchLaunchWebSearch()) {
                    if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                        searchView.getContext().startActivity(searchView.m1024m(searchView.f967g0, searchableInfo));
                    }
                } else {
                    Intent intent = new Intent(searchView.f966f0);
                    ComponentName searchActivity = searchableInfo.getSearchActivity();
                    intent.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
                    searchView.getContext().startActivity(intent);
                }
            } catch (ActivityNotFoundException unused) {
                Log.w("SearchView", "Could not find voice search activity");
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$g */
    public class ViewOnKeyListenerC0272g implements View.OnKeyListener {
        public ViewOnKeyListenerC0272g() {
        }

        /* JADX WARN: Code duplicated, block: B:43:0x0089 A[PHI: r2
          0x0089: PHI (r2v1 boolean) = (r2v0 boolean), (r2v0 boolean), (r2v2 boolean), (r2v0 boolean) binds: [B:17:0x0036, B:19:0x003d, B:42:0x0088, B:33:0x005d] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // android.view.View.OnKeyListener
        public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            boolean z10 = false;
            if (searchView.f983w0 == null) {
                return false;
            }
            SearchAutoComplete searchAutoComplete = searchView.f948K;
            if (!searchAutoComplete.isPopupShowing() || searchAutoComplete.getListSelection() == -1) {
                if ((TextUtils.getTrimmedLength(searchAutoComplete.getText()) == 0) || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i10 != 66) {
                    return false;
                }
                view.cancelLongPress();
                searchView.getContext().startActivity(searchView.m1023l("android.intent.action.SEARCH", null, null, searchAutoComplete.getText().toString()));
                return true;
            }
            if (searchView.f983w0 != null && searchView.f973m0 != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
                if (i10 != 66 && i10 != 84) {
                    if (i10 != 61) {
                        if (i10 == 21 || i10 == 22) {
                            searchAutoComplete.setSelection(i10 == 21 ? 0 : searchAutoComplete.length());
                            searchAutoComplete.setListSelection(0);
                            searchAutoComplete.clearListSelection();
                            searchAutoComplete.m1037a();
                        } else if (i10 == 19) {
                            searchAutoComplete.getListSelection();
                        }
                    }
                    z10 = true;
                }
                searchView.m1027p(searchAutoComplete.getListSelection());
                z10 = true;
            }
            return z10;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$h */
    public class C0273h implements TextView.OnEditorActionListener {
        public C0273h() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
            SearchView.this.m1030s();
            return true;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$i */
    public class C0274i implements AdapterView.OnItemClickListener {
        public C0274i() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public final void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            SearchView.this.m1027p(i10);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$j */
    public class C0275j implements AdapterView.OnItemSelectedListener {
        public C0275j() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
            SearchView.this.m1028q(i10);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$k */
    public static class C0276k {
        /* JADX INFO: renamed from: a */
        public static void m1038a(AutoCompleteTextView autoCompleteTextView) {
            autoCompleteTextView.refreshAutoCompleteResults();
        }

        /* JADX INFO: renamed from: b */
        public static void m1039b(SearchAutoComplete searchAutoComplete, int i10) {
            searchAutoComplete.setInputMethodMode(i10);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$l */
    public interface InterfaceC0277l {
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$m */
    public interface InterfaceC0278m {
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$n */
    public interface InterfaceC0279n {
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$o */
    public static class C0280o {

        /* JADX INFO: renamed from: a */
        public final Method f1003a;

        /* JADX INFO: renamed from: b */
        public final Method f1004b;

        /* JADX INFO: renamed from: c */
        public final Method f1005c;

        @SuppressLint({"DiscouragedPrivateApi", "SoonBlockedPrivateApi"})
        public C0280o() {
            this.f1003a = null;
            this.f1004b = null;
            this.f1005c = null;
            m1040a();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f1003a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f1004b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.f1005c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        /* JADX INFO: renamed from: a */
        public static void m1040a() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$p */
    public static class C0281p extends TouchDelegate {

        /* JADX INFO: renamed from: a */
        public final View f1006a;

        /* JADX INFO: renamed from: b */
        public final Rect f1007b;

        /* JADX INFO: renamed from: c */
        public final Rect f1008c;

        /* JADX INFO: renamed from: d */
        public final Rect f1009d;

        /* JADX INFO: renamed from: e */
        public final int f1010e;

        /* JADX INFO: renamed from: f */
        public boolean f1011f;

        public C0281p(Rect rect, Rect rect2, SearchAutoComplete searchAutoComplete) {
            super(rect, searchAutoComplete);
            int scaledTouchSlop = ViewConfiguration.get(searchAutoComplete.getContext()).getScaledTouchSlop();
            this.f1010e = scaledTouchSlop;
            Rect rect3 = new Rect();
            this.f1007b = rect3;
            Rect rect4 = new Rect();
            this.f1009d = rect4;
            Rect rect5 = new Rect();
            this.f1008c = rect5;
            rect3.set(rect);
            rect4.set(rect);
            int i10 = -scaledTouchSlop;
            rect4.inset(i10, i10);
            rect5.set(rect2);
            this.f1006a = searchAutoComplete;
        }

        /* JADX WARN: Code duplicated, block: B:20:0x004d  */
        @Override // android.view.TouchDelegate
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z10;
            boolean z11;
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean zDispatchTouchEvent = false;
            boolean z12 = true;
            if (action != 0) {
                if (action == 1 || action == 2) {
                    z11 = this.f1011f;
                    if (z11 && !this.f1009d.contains(x10, y10)) {
                        z12 = z11;
                        z10 = false;
                    }
                } else if (action != 3) {
                    z10 = true;
                    z12 = false;
                } else {
                    z11 = this.f1011f;
                    this.f1011f = false;
                }
                z12 = z11;
                z10 = true;
            } else if (this.f1007b.contains(x10, y10)) {
                this.f1011f = true;
                z10 = true;
            } else {
                z10 = true;
                z12 = false;
            }
            if (z12) {
                Rect rect = this.f1008c;
                View view = this.f1006a;
                if (!z10 || rect.contains(x10, y10)) {
                    motionEvent.setLocation(x10 - rect.left, y10 - rect.top);
                } else {
                    motionEvent.setLocation(view.getWidth() / 2, view.getHeight() / 2);
                }
                zDispatchTouchEvent = view.dispatchTouchEvent(motionEvent);
            }
            return zDispatchTouchEvent;
        }
    }

    static {
        f946B0 = Build.VERSION.SDK_INT < 29 ? new C0280o() : null;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f958U = new Rect();
        this.f959V = new Rect();
        this.f960W = new int[2];
        this.f961a0 = new int[2];
        this.f985y0 = new RunnableC0267b();
        this.f986z0 = new RunnableC0268c();
        this.f947A0 = new WeakHashMap<>();
        ViewOnClickListenerC0271f viewOnClickListenerC0271f = new ViewOnClickListenerC0271f();
        ViewOnKeyListenerC0272g viewOnKeyListenerC0272g = new ViewOnKeyListenerC0272g();
        C0273h c0273h = new C0273h();
        C0274i c0274i = new C0274i();
        C0275j c0275j = new C0275j();
        C0266a c0266a = new C0266a();
        int[] iArr = C4999a.f32607u;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        C0300b1 c0300b1 = new C0300b1(context, typedArrayObtainStyledAttributes);
        C10029b0.m18657m(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i10);
        LayoutInflater.from(context).inflate(c0300b1.m1120i(17, R.layout.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.f948K = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f949L = findViewById(R.id.search_edit_frame);
        View viewFindViewById = findViewById(R.id.search_plate);
        this.f950M = viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.submit_area);
        this.f951N = viewFindViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.f952O = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.f953P = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.f954Q = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.f955R = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.f962b0 = imageView5;
        C10029b0.d.m18680q(viewFindViewById, c0300b1.m1116e(18));
        C10029b0.d.m18680q(viewFindViewById2, c0300b1.m1116e(23));
        imageView.setImageDrawable(c0300b1.m1116e(21));
        imageView2.setImageDrawable(c0300b1.m1116e(13));
        imageView3.setImageDrawable(c0300b1.m1116e(10));
        imageView4.setImageDrawable(c0300b1.m1116e(26));
        imageView5.setImageDrawable(c0300b1.m1116e(21));
        this.f963c0 = c0300b1.m1116e(20);
        C0309e1.m1185a(imageView, getResources().getString(R.string.abc_searchview_description_search));
        this.f964d0 = c0300b1.m1120i(24, R.layout.abc_search_dropdown_item_icons_2line);
        this.f965e0 = c0300b1.m1120i(11, 0);
        imageView.setOnClickListener(viewOnClickListenerC0271f);
        imageView3.setOnClickListener(viewOnClickListenerC0271f);
        imageView2.setOnClickListener(viewOnClickListenerC0271f);
        imageView4.setOnClickListener(viewOnClickListenerC0271f);
        searchAutoComplete.setOnClickListener(viewOnClickListenerC0271f);
        searchAutoComplete.addTextChangedListener(c0266a);
        searchAutoComplete.setOnEditorActionListener(c0273h);
        searchAutoComplete.setOnItemClickListener(c0274i);
        searchAutoComplete.setOnItemSelectedListener(c0275j);
        searchAutoComplete.setOnKeyListener(viewOnKeyListenerC0272g);
        searchAutoComplete.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0269d());
        setIconifiedByDefault(c0300b1.m1112a(16, true));
        int iM1115d = c0300b1.m1115d(2, -1);
        if (iM1115d != -1) {
            setMaxWidth(iM1115d);
        }
        this.f968h0 = c0300b1.m1122k(12);
        this.f975o0 = c0300b1.m1122k(19);
        int iM1119h = c0300b1.m1119h(6, -1);
        if (iM1119h != -1) {
            setImeOptions(iM1119h);
        }
        int iM1119h2 = c0300b1.m1119h(5, -1);
        if (iM1119h2 != -1) {
            setInputType(iM1119h2);
        }
        setFocusable(c0300b1.m1112a(1, true));
        c0300b1.m1124n();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f966f0 = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f967g0 = intent2;
        intent2.addFlags(268435456);
        View viewFindViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f956S = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC0270e());
        }
        m1036y(this.f971k0);
        m1033v();
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        SearchAutoComplete searchAutoComplete = this.f948K;
        searchAutoComplete.setText(charSequence);
        searchAutoComplete.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    @Override // p164i.InterfaceC6101b
    /* JADX INFO: renamed from: c */
    public final void mo1021c() {
        if (this.f981u0) {
            return;
        }
        this.f981u0 = true;
        SearchAutoComplete searchAutoComplete = this.f948K;
        int imeOptions = searchAutoComplete.getImeOptions();
        this.f982v0 = imeOptions;
        searchAutoComplete.setImeOptions(imeOptions | 33554432);
        searchAutoComplete.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.f977q0 = true;
        super.clearFocus();
        SearchAutoComplete searchAutoComplete = this.f948K;
        searchAutoComplete.clearFocus();
        searchAutoComplete.setImeVisibility(false);
        this.f977q0 = false;
    }

    @Override // p164i.InterfaceC6101b
    /* JADX INFO: renamed from: e */
    public final void mo1022e() {
        SearchAutoComplete searchAutoComplete = this.f948K;
        searchAutoComplete.setText("");
        searchAutoComplete.setSelection(searchAutoComplete.length());
        this.f980t0 = "";
        clearFocus();
        m1036y(true);
        searchAutoComplete.setImeOptions(this.f982v0);
        this.f981u0 = false;
    }

    public int getImeOptions() {
        return this.f948K.getImeOptions();
    }

    public int getInputType() {
        return this.f948K.getInputType();
    }

    public int getMaxWidth() {
        return this.f978r0;
    }

    public CharSequence getQuery() {
        return this.f948K.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f975o0;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f983w0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f968h0 : getContext().getText(this.f983w0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.f965e0;
    }

    public int getSuggestionRowLayout() {
        return this.f964d0;
    }

    public AbstractC1673a getSuggestionsAdapter() {
        return this.f973m0;
    }

    /* JADX INFO: renamed from: l */
    public final Intent m1023l(String str, Uri uri, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f980t0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f984x0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.f983w0.getSearchActivity());
        return intent;
    }

    /* JADX INFO: renamed from: m */
    public final Intent m1024m(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f984x0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String strFlattenToShortString = null;
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        if (searchActivity != null) {
            strFlattenToShortString = searchActivity.flattenToShortString();
        }
        intent3.putExtra("calling_package", strFlattenToShortString);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    /* JADX INFO: renamed from: n */
    public final void m1025n() {
        int i10 = Build.VERSION.SDK_INT;
        SearchAutoComplete searchAutoComplete = this.f948K;
        if (i10 >= 29) {
            C0276k.m1038a(searchAutoComplete);
            return;
        }
        C0280o c0280o = f946B0;
        c0280o.getClass();
        C0280o.m1040a();
        Method method = c0280o.f1003a;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, new Object[0]);
            } catch (Exception unused) {
            }
        }
        c0280o.getClass();
        C0280o.m1040a();
        Method method2 = c0280o.f1004b;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete, new Object[0]);
            } catch (Exception unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m1026o() {
        SearchAutoComplete searchAutoComplete = this.f948K;
        if (!TextUtils.isEmpty(searchAutoComplete.getText())) {
            searchAutoComplete.setText("");
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
        } else if (this.f971k0) {
            clearFocus();
            m1036y(true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f985y0);
        post(this.f986z0);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.C0323j0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            SearchAutoComplete searchAutoComplete = this.f948K;
            int[] iArr = this.f960W;
            searchAutoComplete.getLocationInWindow(iArr);
            int[] iArr2 = this.f961a0;
            getLocationInWindow(iArr2);
            int i14 = iArr[1] - iArr2[1];
            int i15 = iArr[0] - iArr2[0];
            int width = searchAutoComplete.getWidth() + i15;
            int height = searchAutoComplete.getHeight() + i14;
            Rect rect = this.f958U;
            rect.set(i15, i14, width, height);
            int i16 = rect.left;
            int i17 = rect.right;
            int i18 = i13 - i11;
            Rect rect2 = this.f959V;
            rect2.set(i16, 0, i17, i18);
            C0281p c0281p = this.f957T;
            if (c0281p == null) {
                C0281p c0281p2 = new C0281p(rect2, rect, searchAutoComplete);
                this.f957T = c0281p2;
                setTouchDelegate(c0281p2);
            } else {
                c0281p.f1007b.set(rect2);
                Rect rect3 = c0281p.f1009d;
                rect3.set(rect2);
                int i19 = -c0281p.f1010e;
                rect3.inset(i19, i19);
                c0281p.f1008c.set(rect);
            }
        }
    }

    @Override // androidx.appcompat.widget.C0323j0, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        if (this.f972l0) {
            super.onMeasure(i10, i11);
            return;
        }
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode == Integer.MIN_VALUE) {
            int i13 = this.f978r0;
            if (i13 > 0) {
                size = Math.min(i13, size);
            } else {
                size = Math.min(getPreferredWidth(), size);
            }
        } else if (mode == 0) {
            size = this.f978r0;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i12 = this.f978r0) > 0) {
            size = Math.min(i12, size);
        }
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f5635a);
        m1036y(savedState.f987c);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f987c = this.f972l0;
        return savedState;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        post(this.f985y0);
    }

    /* JADX INFO: renamed from: p */
    public final void m1027p(int i10) {
        int position;
        String strM1270i;
        Cursor cursor = this.f973m0.f9382c;
        if (cursor != null && cursor.moveToPosition(i10)) {
            Intent intentM1023l = null;
            try {
                int i11 = ViewOnClickListenerC0347v0.f1345S;
                String strM1270i2 = ViewOnClickListenerC0347v0.m1270i(cursor, cursor.getColumnIndex("suggest_intent_action"));
                if (strM1270i2 == null) {
                    strM1270i2 = this.f983w0.getSuggestIntentAction();
                }
                if (strM1270i2 == null) {
                    strM1270i2 = "android.intent.action.SEARCH";
                }
                String strM1270i3 = ViewOnClickListenerC0347v0.m1270i(cursor, cursor.getColumnIndex("suggest_intent_data"));
                if (strM1270i3 == null) {
                    strM1270i3 = this.f983w0.getSuggestIntentData();
                }
                if (strM1270i3 != null && (strM1270i = ViewOnClickListenerC0347v0.m1270i(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                    strM1270i3 = strM1270i3 + "/" + Uri.encode(strM1270i);
                }
                intentM1023l = m1023l(strM1270i2, strM1270i3 == null ? intentM1023l : Uri.parse(strM1270i3), ViewOnClickListenerC0347v0.m1270i(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), ViewOnClickListenerC0347v0.m1270i(cursor, cursor.getColumnIndex("suggest_intent_query")));
            } catch (RuntimeException e10) {
                try {
                    position = cursor.getPosition();
                } catch (RuntimeException unused) {
                    position = -1;
                }
                Log.w("SearchView", "Search suggestions cursor at row " + position + " returned exception.", e10);
            }
            if (intentM1023l != null) {
                try {
                    getContext().startActivity(intentM1023l);
                } catch (RuntimeException e11) {
                    Log.e("SearchView", "Failed launch activity: " + intentM1023l, e11);
                }
            }
        }
        SearchAutoComplete searchAutoComplete = this.f948K;
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    /* JADX INFO: renamed from: q */
    public final void m1028q(int i10) {
        Editable text = this.f948K.getText();
        Cursor cursor = this.f973m0.f9382c;
        if (cursor == null) {
            return;
        }
        if (!cursor.moveToPosition(i10)) {
            setQuery(text);
            return;
        }
        String strMo1273d = this.f973m0.mo1273d(cursor);
        if (strMo1273d != null) {
            setQuery(strMo1273d);
        } else {
            setQuery(text);
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m1029r(CharSequence charSequence) {
        setQuery(charSequence);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i10, Rect rect) {
        if (!this.f977q0 && isFocusable()) {
            if (this.f972l0) {
                return super.requestFocus(i10, rect);
            }
            boolean zRequestFocus = this.f948K.requestFocus(i10, rect);
            if (zRequestFocus) {
                m1036y(false);
            }
            return zRequestFocus;
        }
        return false;
    }

    /* JADX INFO: renamed from: s */
    public final void m1030s() {
        SearchAutoComplete searchAutoComplete = this.f948K;
        Editable text = searchAutoComplete.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            if (this.f983w0 != null) {
                getContext().startActivity(m1023l("android.intent.action.SEARCH", null, null, text.toString()));
            }
            searchAutoComplete.setImeVisibility(false);
            searchAutoComplete.dismissDropDown();
        }
    }

    public void setAppSearchData(Bundle bundle) {
        this.f984x0 = bundle;
    }

    public void setIconified(boolean z10) {
        if (z10) {
            m1026o();
            return;
        }
        m1036y(false);
        SearchAutoComplete searchAutoComplete = this.f948K;
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f970j0;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void setIconifiedByDefault(boolean z10) {
        if (this.f971k0 == z10) {
            return;
        }
        this.f971k0 = z10;
        m1036y(z10);
        m1033v();
    }

    public void setImeOptions(int i10) {
        this.f948K.setImeOptions(i10);
    }

    public void setInputType(int i10) {
        this.f948K.setInputType(i10);
    }

    public void setMaxWidth(int i10) {
        this.f978r0 = i10;
        requestLayout();
    }

    public void setOnCloseListener(InterfaceC0277l interfaceC0277l) {
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f969i0 = onFocusChangeListener;
    }

    public void setOnQueryTextListener(InterfaceC0278m interfaceC0278m) {
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f970j0 = onClickListener;
    }

    public void setOnSuggestionListener(InterfaceC0279n interfaceC0279n) {
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f975o0 = charSequence;
        m1033v();
    }

    public void setQueryRefinementEnabled(boolean z10) {
        this.f976p0 = z10;
        AbstractC1673a abstractC1673a = this.f973m0;
        if (abstractC1673a instanceof ViewOnClickListenerC0347v0) {
            ((ViewOnClickListenerC0347v0) abstractC1673a).f1349K = z10 ? 2 : 1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00bb  */
    public void setSearchableInfo(SearchableInfo searchableInfo) {
        Intent intent;
        this.f983w0 = searchableInfo;
        SearchAutoComplete searchAutoComplete = this.f948K;
        boolean z10 = true;
        if (searchableInfo != null) {
            searchAutoComplete.setThreshold(searchableInfo.getSuggestThreshold());
            searchAutoComplete.setImeOptions(this.f983w0.getImeOptions());
            int inputType = this.f983w0.getInputType();
            if ((inputType & 15) == 1) {
                inputType &= -65537;
                if (this.f983w0.getSuggestAuthority() != null) {
                    inputType = inputType | 65536 | 524288;
                }
            }
            searchAutoComplete.setInputType(inputType);
            AbstractC1673a abstractC1673a = this.f973m0;
            if (abstractC1673a != null) {
                abstractC1673a.mo1272c(null);
            }
            if (this.f983w0.getSuggestAuthority() != null) {
                ViewOnClickListenerC0347v0 viewOnClickListenerC0347v0 = new ViewOnClickListenerC0347v0(getContext(), this, this.f983w0, this.f947A0);
                this.f973m0 = viewOnClickListenerC0347v0;
                searchAutoComplete.setAdapter(viewOnClickListenerC0347v0);
                ((ViewOnClickListenerC0347v0) this.f973m0).f1349K = this.f976p0 ? 2 : 1;
            }
            m1033v();
        }
        SearchableInfo searchableInfo2 = this.f983w0;
        if (searchableInfo2 == null || !searchableInfo2.getVoiceSearchEnabled()) {
            z10 = false;
        } else {
            if (this.f983w0.getVoiceSearchLaunchWebSearch()) {
                intent = this.f966f0;
            } else {
                intent = this.f983w0.getVoiceSearchLaunchRecognizer() ? this.f967g0 : null;
            }
            if (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) {
                z10 = false;
            }
        }
        this.f979s0 = z10;
        if (z10) {
            searchAutoComplete.setPrivateImeOptions("nm");
        }
        m1036y(this.f972l0);
    }

    public void setSubmitButtonEnabled(boolean z10) {
        this.f974n0 = z10;
        m1036y(this.f972l0);
    }

    public void setSuggestionsAdapter(AbstractC1673a abstractC1673a) {
        this.f973m0 = abstractC1673a;
        this.f948K.setAdapter(abstractC1673a);
    }

    /* JADX INFO: renamed from: t */
    public final void m1031t() {
        boolean z10 = true;
        boolean z11 = !TextUtils.isEmpty(this.f948K.getText());
        int i10 = 0;
        if (!z11 && (!this.f971k0 || this.f981u0)) {
            z10 = false;
        }
        if (!z10) {
            i10 = 8;
        }
        ImageView imageView = this.f954Q;
        imageView.setVisibility(i10);
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.setState(z11 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m1032u() {
        int[] iArr = this.f948K.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f950M.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f951N.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: v */
    public final void m1033v() {
        CharSequence charSequence;
        CharSequence queryHint = getQueryHint();
        CharSequence charSequence2 = queryHint;
        if (queryHint == null) {
            charSequence2 = "";
        }
        boolean z10 = this.f971k0;
        SearchAutoComplete searchAutoComplete = this.f948K;
        CharSequence charSequence3 = charSequence2;
        if (z10) {
            Drawable drawable = this.f963c0;
            if (drawable != null) {
                charSequence = charSequence2;
                int textSize = (int) (((double) searchAutoComplete.getTextSize()) * 1.25d);
                drawable.setBounds(0, 0, textSize, textSize);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
                spannableStringBuilder.setSpan(new ImageSpan(drawable), 1, 2, 33);
                spannableStringBuilder.append(charSequence2);
                charSequence3 = spannableStringBuilder;
                charSequence = charSequence3;
            }
        } else {
            charSequence = charSequence3;
        }
        charSequence = charSequence2;
        searchAutoComplete.setHint(charSequence);
    }

    /* JADX INFO: renamed from: w */
    public final void m1034w() {
        int i10 = 0;
        if (!((this.f974n0 || this.f979s0) && !this.f972l0) || (this.f953P.getVisibility() != 0 && this.f955R.getVisibility() != 0)) {
            i10 = 8;
        }
        this.f951N.setVisibility(i10);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0029  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0026, code lost:
    
        if (r6.f979s0 == false) goto L21;
     */
    /* JADX INFO: renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1035x(boolean z10) {
        int i10;
        boolean z11 = this.f974n0;
        if (z11) {
            i10 = 0;
            if (!((z11 || this.f979s0) && !this.f972l0) || !hasFocus()) {
                i10 = 8;
            } else if (z10) {
            }
        } else {
            i10 = 8;
        }
        this.f953P.setVisibility(i10);
    }

    /* JADX INFO: renamed from: y */
    public final void m1036y(boolean z10) {
        this.f972l0 = z10;
        int i10 = 0;
        int i11 = z10 ? 0 : 8;
        boolean z11 = !TextUtils.isEmpty(this.f948K.getText());
        this.f952O.setVisibility(i11);
        m1035x(z11);
        this.f949L.setVisibility(z10 ? 8 : 0);
        ImageView imageView = this.f962b0;
        imageView.setVisibility((imageView.getDrawable() == null || this.f971k0) ? 8 : 0);
        m1031t();
        boolean z12 = !z11;
        if (this.f979s0 && !this.f972l0 && z12) {
            this.f953P.setVisibility(8);
        } else {
            i10 = 8;
        }
        this.f955R.setVisibility(i10);
        m1034w();
    }
}
