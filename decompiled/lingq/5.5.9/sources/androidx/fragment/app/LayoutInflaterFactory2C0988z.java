package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.media.C0141b;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.fragment.app.strictmode.FragmentTagUsageViolation;
import p313p3.C8183a;

/* JADX INFO: renamed from: androidx.fragment.app.z */
/* JADX INFO: loaded from: classes.dex */
public final class LayoutInflaterFactory2C0988z implements LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: a */
    public final FragmentManager f6432a;

    /* JADX INFO: renamed from: androidx.fragment.app.z$a */
    public class a implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C0959j0 f6433a;

        public a(C0959j0 c0959j0) {
            this.f6433a = c0959j0;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            C0959j0 c0959j0 = this.f6433a;
            Fragment fragment = c0959j0.f6311c;
            c0959j0.m3748k();
            SpecialEffectsController.m3682f((ViewGroup) fragment.f6094c0.getParent(), LayoutInflaterFactory2C0988z.this.f6432a.m3621I()).m3687e();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }

    public LayoutInflaterFactory2C0988z(FragmentManager fragmentManager) {
        this.f6432a = fragmentManager;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean zIsAssignableFrom;
        C0959j0 c0959j0M3645f;
        boolean zEquals = FragmentContainerView.class.getName().equals(str);
        FragmentManager fragmentManager = this.f6432a;
        if (zEquals) {
            return new FragmentContainerView(context, attributeSet, fragmentManager);
        }
        Fragment fragmentMo3674a = null;
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C8183a.f44324a);
        int id2 = 0;
        if (attributeValue == null) {
            attributeValue = typedArrayObtainStyledAttributes.getString(0);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        String string = typedArrayObtainStyledAttributes.getString(2);
        typedArrayObtainStyledAttributes.recycle();
        if (attributeValue != null) {
            try {
                zIsAssignableFrom = Fragment.class.isAssignableFrom(C0985w.m3817b(context.getClassLoader(), attributeValue));
            } catch (ClassNotFoundException unused) {
                zIsAssignableFrom = false;
            }
            if (zIsAssignableFrom) {
                if (view != null) {
                    id2 = view.getId();
                }
                if (id2 == -1 && resourceId == -1) {
                    if (string == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                }
                if (resourceId != -1) {
                    fragmentMo3674a = fragmentManager.m3615C(resourceId);
                }
                if (fragmentMo3674a == null && string != null) {
                    fragmentMo3674a = fragmentManager.m3616D(string);
                }
                if (fragmentMo3674a == null && id2 != -1) {
                    fragmentMo3674a = fragmentManager.m3615C(id2);
                }
                if (fragmentMo3674a == null) {
                    C0985w c0985wM3619G = fragmentManager.m3619G();
                    context.getClassLoader();
                    fragmentMo3674a = c0985wM3619G.mo3674a(attributeValue);
                    fragmentMo3674a.f6072J = true;
                    fragmentMo3674a.f6081S = resourceId != 0 ? resourceId : id2;
                    fragmentMo3674a.f6082T = id2;
                    fragmentMo3674a.f6083U = string;
                    fragmentMo3674a.f6073K = true;
                    fragmentMo3674a.f6077O = fragmentManager;
                    AbstractC0986x<?> abstractC0986x = fragmentManager.f6178u;
                    fragmentMo3674a.f6078P = abstractC0986x;
                    fragmentMo3674a.mo3565N(abstractC0986x.f6429b, attributeSet, fragmentMo3674a.f6091b);
                    c0959j0M3645f = fragmentManager.m3635a(fragmentMo3674a);
                    if (FragmentManager.m3608K(2)) {
                        Log.v("FragmentManager", "Fragment " + fragmentMo3674a + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                    }
                } else {
                    if (fragmentMo3674a.f6073K) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id2) + " with another fragment for " + attributeValue);
                    }
                    fragmentMo3674a.f6073K = true;
                    fragmentMo3674a.f6077O = fragmentManager;
                    AbstractC0986x<?> abstractC0986x2 = fragmentManager.f6178u;
                    fragmentMo3674a.f6078P = abstractC0986x2;
                    fragmentMo3674a.mo3565N(abstractC0986x2.f6429b, attributeSet, fragmentMo3674a.f6091b);
                    c0959j0M3645f = fragmentManager.m3645f(fragmentMo3674a);
                    if (FragmentManager.m3608K(2)) {
                        Log.v("FragmentManager", "Retained Fragment " + fragmentMo3674a + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                    }
                }
                ViewGroup viewGroup = (ViewGroup) view;
                FragmentStrictMode.C0978a c0978a = FragmentStrictMode.f6401a;
                FragmentTagUsageViolation fragmentTagUsageViolation = new FragmentTagUsageViolation(fragmentMo3674a, viewGroup);
                FragmentStrictMode.m3801c(fragmentTagUsageViolation);
                FragmentStrictMode.C0978a c0978aM3799a = FragmentStrictMode.m3799a(fragmentMo3674a);
                if (c0978aM3799a.f6403a.contains(FragmentStrictMode.Flag.DETECT_FRAGMENT_TAG_USAGE) && FragmentStrictMode.m3803e(c0978aM3799a, fragmentMo3674a.getClass(), FragmentTagUsageViolation.class)) {
                    FragmentStrictMode.m3800b(c0978aM3799a, fragmentTagUsageViolation);
                }
                fragmentMo3674a.f6092b0 = viewGroup;
                c0959j0M3645f.m3748k();
                c0959j0M3645f.m3747j();
                View view2 = fragmentMo3674a.f6094c0;
                if (view2 == null) {
                    throw new IllegalStateException(C0141b.m611g("Fragment ", attributeValue, " did not create a view."));
                }
                if (resourceId != 0) {
                    view2.setId(resourceId);
                }
                if (fragmentMo3674a.f6094c0.getTag() == null) {
                    fragmentMo3674a.f6094c0.setTag(string);
                }
                fragmentMo3674a.f6094c0.addOnAttachStateChangeListener(new a(c0959j0M3645f));
                return fragmentMo3674a.f6094c0;
            }
        }
        return null;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
